package cn.unnow.mallcoupon.dao;

import cn.unnow.mallcoupon.entity.SeckillSkuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 * 
 * @author heyuxin
 * @email heyux1n@foxmail.com
 * @date 2022-11-20 13:06:35
 */
@Mapper
public interface SeckillSkuRelationDao extends BaseMapper<SeckillSkuRelationEntity> {
	
}
