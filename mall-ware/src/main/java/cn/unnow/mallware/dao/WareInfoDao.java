package cn.unnow.mallware.dao;

import cn.unnow.mallware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author heyuxin
 * @email heyux1n@foxmail.com
 * @date 2022-11-20 13:21:25
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
