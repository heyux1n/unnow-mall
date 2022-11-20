package cn.unnow.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.unnow.common.utils.PageUtils;
import cn.unnow.mallproduct.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author heyuxin
 * @email heyux1n@foxmail.com
 * @date 2022-11-20 10:36:27
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

