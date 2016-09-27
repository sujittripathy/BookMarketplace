package com.hyperion.spring4.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by stripathy on 9/23/2016.
 */
public class BookMarketPlaceWebappInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class<?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class<?>[]{ThymeleafConfig.class};//,JSPConfig.class
    }

    @Override
    protected String[] getServletMappings() {

        return new String[] {"/*"};
    }
}
