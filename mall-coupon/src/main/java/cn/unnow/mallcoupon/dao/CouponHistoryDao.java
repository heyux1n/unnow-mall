package cn.unnow.mallcoupon.dao;

import cn.unnow.mallcoupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author heyuxin
 * @email heyux1n@foxmail.com
 * @date 2022-11-20 13:06:35
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
