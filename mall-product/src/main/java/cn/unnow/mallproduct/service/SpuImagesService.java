package cn.unnow.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.unnow.common.utils.PageUtils;
import cn.unnow.mallproduct.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author heyuxin
 * @email heyux1n@foxmail.com
 * @date 2022-11-20 10:36:27
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

