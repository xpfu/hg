package com.fxp.hg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: hg-master
 * @author: xp.fu
 * @create: 2019-12-26 15:32
 * @description: 用于生成基础代码的模块
 **/
public class Generator {

    public static void main(String[] args) throws Exception {
        // 执行过程中的警告信息
        List<String> warnings = new ArrayList<>();
        // 当生成的代码重复时，覆盖源代码
        boolean overWrite = true;
        // 读取生成代码的配置文件
        InputStream inputStream = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
        Configuration configuration = configurationParser.parseConfiguration(inputStream);
        inputStream.close();

        DefaultShellCallback defaultShellCallback = new DefaultShellCallback(overWrite);
        // 创建代码
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration,defaultShellCallback,warnings);
        // 执行生成代码
        myBatisGenerator.generate(null);
        // 输出警告信息
        for (String warning : warnings){
            System.out.println(warning);
        }
    }
}
