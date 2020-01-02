package com.fxp.hg.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: hg
 * @author: xp.fu
 * @create: 2019-12-27 10:22
 * @description: Mybatis配置信息
 **/
@Configuration
@MapperScan({"com.fxp.hg.mapper","com.fxp.hg.search.dao"})
public class MybatisConfig {
}
