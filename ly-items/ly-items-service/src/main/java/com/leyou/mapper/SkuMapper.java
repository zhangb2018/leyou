package com.leyou.mapper;

import com.leyou.item.pojo.Sku;
import tk.mybatis.mapper.additional.idlist.DeleteByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SkuMapper extends Mapper<Sku> , DeleteByIdListMapper<Sku,Long> {
}
