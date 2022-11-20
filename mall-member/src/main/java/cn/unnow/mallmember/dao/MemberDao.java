package cn.unnow.mallmember.dao;

import cn.unnow.mallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author heyuxin
 * @email heyux1n@foxmail.com
 * @date 2022-11-20 13:12:09
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
