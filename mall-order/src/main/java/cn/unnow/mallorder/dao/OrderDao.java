package cn.unnow.mallorder.dao;

import cn.unnow.mallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author heyuxin
 * @email heyux1n@foxmail.com
 * @date 2022-11-20 13:19:14
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
