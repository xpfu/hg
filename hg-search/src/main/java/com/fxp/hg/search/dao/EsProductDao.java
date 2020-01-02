package com.fxp.hg.search.dao;

import com.fxp.hg.search.domain.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-27 10:09
 * @description: 搜索系统中的商品管理自定义Dao
 **/
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
