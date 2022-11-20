package cn.unnow.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.unnow.common.utils.PageUtils;
import cn.unnow.mallproduct.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author heyuxin
 * @email heyux1n@foxmail.com
 * @date 2022-11-20 10:36:27
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

