package com.fxp.hg.search;

import com.fxp.hg.search.dao.EsProductDao;
import com.fxp.hg.search.domain.EsProduct;
import com.fxp.hg.search.service.EsProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HgSearchApplicationTests {

    @Autowired
    private EsProductDao productDao;
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Autowired
    private EsProductService esProductService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testGetAllEsProductList(){
        List<EsProduct> esProductList = productDao.getAllEsProductList(null);
        System.out.print(esProductList);
    }
    @Test
    public void testEsProductMapping(){
        elasticsearchTemplate.putMapping(EsProduct.class);
        Map mapping = elasticsearchTemplate.getMapping(EsProduct.class);
        System.out.println(mapping);
    }

    @Test
    public void testImportAllService(){
        int count = esProductService.importAll();

        System.out.println("===========" + count + "===========");
    }

}
