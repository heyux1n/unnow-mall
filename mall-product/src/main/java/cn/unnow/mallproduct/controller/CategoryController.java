package cn.unnow.mallproduct.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.unnow.mallproduct.entity.CategoryEntity;
import cn.unnow.mallproduct.service.CategoryService;
import cn.unnow.common.utils.PageUtils;
import cn.unnow.common.utils.R;



/**
 * 商品三级分类
 *
 * @author heyuxin
 * @email heyux1n@foxmail.com
 * @date 2022-11-20 11:23:36
 */
@RestController
@RequestMapping("mallproduct/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 树形列表
     */
    @RequestMapping("/list/tree")
    public R listWithTree(){
        List<CategoryEntity> categoryEntities = categoryService.listWithTree();
        return R.ok().put("data", categoryEntities);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds){
		categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
