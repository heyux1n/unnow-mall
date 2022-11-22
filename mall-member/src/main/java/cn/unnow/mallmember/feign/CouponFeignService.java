package cn.unnow.mallmember.feign;

import cn.unnow.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: heyuxin
 * @Date: 2022/11/20 16:31
 * @Version: 1.0
 * @Description:
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {

    @RequestMapping("/mallcoupon/coupon/member/list")
    public R memberCoupons();

}
