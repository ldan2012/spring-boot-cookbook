package com.config;

import com.global.filter.AddExtraToParamsFilter;
import com.global.filter.RewriteServletPathFilter;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by MyWorld on 2016/9/25.
 */
@Configuration
public class FilterConfig {

    /**
     * 定义多个FilterRegistrationBean，都会生效，类似于web.xml中的定义
     * @return
     */
    @Bean
    public FilterRegistrationBean addExtraToParamsFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new AddExtraToParamsFilter());
        filterRegistrationBean.setOrder(2);
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new RewriteServletPathFilter());
        filterRegistrationBean.setOrder(3);
        return filterRegistrationBean;
    }
}
