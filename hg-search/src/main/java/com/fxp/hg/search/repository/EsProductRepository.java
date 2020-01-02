package com.fxp.hg.search.repository;

import com.fxp.hg.search.domain.EsProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-27 10:20
 * @description: 商品ES操作类
 **/
public interface EsProductRepository extends ElasticsearchRepository<EsProduct,Long> {

    /***
     * @creed: Talk is cheap,show me the code
     * @Date: 2019/12/27 0027 10:21
     * @Description: 搜索查询
     * @Param name:     商品名称
     * @Param subTitle: 商品标题
     * @Param keywords: 商品关键字信息
     * @Param page:     分页信息
     * @Return: 
     **/
    Page<EsProduct> findByNameOrSubTitleOrKeywords(String name, String subTitle, String keywords, Pageable page);
}
