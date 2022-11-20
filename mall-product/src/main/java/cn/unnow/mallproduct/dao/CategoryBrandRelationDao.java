package cn.unnow.mallproduct.dao;

import cn.unnow.mallproduct.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author heyuxin
 * @email heyux1n@foxmail.com
 * @date 2022-11-20 10:36:27
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
