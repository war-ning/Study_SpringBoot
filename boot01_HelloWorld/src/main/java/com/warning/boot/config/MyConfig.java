package com.warning.boot.config;

import com.warning.boot.bean.Pet;
import com.warning.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // 告诉SpringBoot 这是一个配置类
public class MyConfig {
    @Bean   // 给容器中注入组件,方法名是id ,返回值类型是class,注入的属性就是返回的对象
    public User user01(){
        return new User(1,"韩小贱");
    }

    public Pet myPet(){
        return new Pet("毛小豆",10.00);
    }
}
