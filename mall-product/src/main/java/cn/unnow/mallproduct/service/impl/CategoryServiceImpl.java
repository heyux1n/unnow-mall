package cn.unnow.mallproduct.service.impl;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.unnow.common.utils.PageUtils;
import cn.unnow.common.utils.Query;

import cn.unnow.mallproduct.dao.CategoryDao;
import cn.unnow.mallproduct.entity.CategoryEntity;
import cn.unnow.mallproduct.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryEntities = this.baseMapper.selectList(null);
       return categoryEntities.stream()
                .filter(category -> category.getParentCid() == 0)
                .map(menu -> {
                    menu.setChildren(getChildren(menu, categoryEntities));
                    return menu;
                })
                .sorted(Comparator.comparingInt(CategoryEntity::getSort))
                .collect(Collectors.toList());
    }

    private List<CategoryEntity> getChildren(CategoryEntity rootNode, List<CategoryEntity> allNode) {
        if(null == rootNode) {
            return new ArrayList();
        }
        return allNode.stream()
                .filter(node -> node.getParentCid().equals(rootNode.getCatId()))
                .map(node -> {
                    node.setChildren(getChildren(node, allNode));
                    return node;
                })
                .sorted(Comparator.comparing(CategoryEntity::getSort, Comparator.nullsLast(Integer::compareTo)))
                .collect(Collectors.toList());
    }

}