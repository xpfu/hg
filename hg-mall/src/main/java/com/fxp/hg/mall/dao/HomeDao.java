package com.fxp.hg.mall.dao;

import com.fxp.hg.model.PmsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-27 13:47
 * @description: 首页内容管理自定义Dao
 **/
public interface HomeDao {

    /**
     * 获取新品推荐
     */
    List<PmsProduct> getNewProductList(@Param("offset") Integer offset, @Param("limit") Integer limit);
    /**
     * 获取人气推荐
     */
    List<PmsProduct> getHotProductList(@Param("offset") Integer offset,@Param("limit") Integer limit);

}
