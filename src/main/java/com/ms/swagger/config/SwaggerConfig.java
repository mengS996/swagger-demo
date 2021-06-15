package com.ms.swagger.config;

import org.omg.CORBA.Any;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author ：孟老师
 * @date ：Created in 2021/3/22 13:28
 * @description：
 * @modified By：
 * @version: $
 */

@Configuration
@EnableSwagger2 //开启Swagger2
public class SwaggerConfig {

    //配置多个分组
    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("A");
    }
    //配置多个分组
    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("B");
    }
    //配置多个分组
    @Bean
    public Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("C");
    }
    //配置Swagger的Docket的bean实例
    @Bean
    public Docket docket(Environment environment){
        //设置要显示的Swagger环境,假如是dev或者test返回true
        Profiles profiles=Profiles.of("dev","test");
        //通过acceptsProfiles，判断是否处在自己设定的环境中
        boolean flag = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(myApiInfo())
                .enable(flag)
                .groupName("孟先生的团队")
                .select()
                //RequestHandlerSelectors 配置要扫描接口的方式
                //basePackage指定要扫描的包
                //any 扫描全部
                //none 都不扫描
                //withMethodAnnotation 扫描方法上的注解
                //.apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.ms"))
                .build();
    }

    //配置Swagger信息 apiInfo
    public ApiInfo myApiInfo(){
        //作者信息
        Contact contact=new Contact("孟帅", "https://www.baidu.com", "666666@qq.com");
        return new ApiInfo(
                "孟帅的Api Documentation",
                "小伙伴们，快来实现自己第一个Api Documentation吧",
                "V1.0",
                "https://www.baidu.com",
                 contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
        );
    }
}
