package com.fxp.hg.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-26 17:58
 * @description: MyBatis配置类
 **/
@Configuration
@EnableTransactionManagement
@MapperScan({"com.fxp.hg.mapper","com.fxp.hg.dao"})
public class MyBatisConfig {
}
