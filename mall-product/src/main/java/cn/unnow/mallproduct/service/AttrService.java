package cn.unnow.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.unnow.common.utils.PageUtils;
import cn.unnow.mallproduct.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author heyuxin
 * @email heyux1n@foxmail.com
 * @date 2022-11-20 10:36:27
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

