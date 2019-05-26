package com.kopoto.yhh.book.spi;

import com.kopoto.yhh.book.BookAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = BookAutoConfiguration.FEIGN_CLIENT_NAME)
public interface BookSpi {

}
