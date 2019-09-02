package com.leyou.mapper;

import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BrandMapper extends Mapper<Brand> {

    @Insert("insert into tb_category_brand(category_id,brand_id) values (#{cid},#{id})")
    void insertBrandCategory(Long id,Long cid);

    @Select("select t1.* from tb_brand t1 ,tb_category_brand t2 where t1.id=t2.brand_id and category_id=#{ss}")
    List<Brand> queryBrandByCategory(@Param("ss") Long cid);

}
