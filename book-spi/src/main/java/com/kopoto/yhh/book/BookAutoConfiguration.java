package com.kopoto.yhh.book;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnExpression(BookAutoConfiguration.EXCLUDE_SPI_PROVIDER) // 本地实现SPI时避免 SPI 的实例化
@EnableFeignClients(basePackageClasses = {BookAutoConfiguration.class})
public class BookAutoConfiguration {
    /**
     * 服务名
     */
    public final static String FEIGN_CLIENT_NAME = "book-server";
    static final String EXCLUDE_SPI_PROVIDER = "#{'${spring.application.name}'!='book-server'}";
}

