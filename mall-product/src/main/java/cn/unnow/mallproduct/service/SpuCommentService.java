package cn.unnow.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.unnow.common.utils.PageUtils;
import cn.unnow.mallproduct.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author heyuxin
 * @email heyux1n@foxmail.com
 * @date 2022-11-20 10:36:27
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

