package com.fxp.hg.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-27 13:36
 * @description: MyBatis配置类
 **/
@Configuration
@EnableTransactionManagement
@MapperScan({"com.fxp.hg.mapper","com.fxp.hg.mall.dao"})
public class MyBatisConfig {
}
