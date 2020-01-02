package com.fxp.hg.security.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: hg-master
 * @author: xp.fu
 * @create: 2019-12-26 16:45
 * @description: 用于配置不需要保护的资源路径
 **/
@Getter
@Setter
@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoreUrlsConfig {
    private List<String> urls = new ArrayList<>();
}
