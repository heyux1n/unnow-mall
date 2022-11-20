package cn.unnow.mallproduct;

import cn.unnow.mallproduct.entity.BrandEntity;
import cn.unnow.mallproduct.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    private BrandService brandService;
    @Test
    void insertBrandService() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
    }


    @Test
    void updateBrandService() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为品牌");
        brandService.updateById(brandEntity);
    }


    @Test
    void getBrandService() {
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(brandEntity -> {
            System.out.println(brandEntity);
        });
    }

}
