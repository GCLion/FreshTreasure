package com.djm.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.djm.common.utils.PageUtils;
import com.djm.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author djm
 * @email djm@gmail.com
 * @date 2021-11-23 21:10:42
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

