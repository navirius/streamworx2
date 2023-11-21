package com.streamworx2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.tuckey.web.filters.urlrewrite.Conf;
import org.tuckey.web.filters.urlrewrite.UrlRewriteFilter;
import org.tuckey.web.filters.urlrewrite.UrlRewriter;

import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class UrlFilterConfig extends UrlRewriteFilter{
    private UrlRewriter urlRewriter;
    @Override
    protected void loadUrlRewriter(FilterConfig filterConfig) throws ServletException {
        try {
            ClassPathResource classPathResource = new ClassPathResource("urlrewrite.xml");
            InputStream inputStream = classPathResource.getInputStream();
            Conf conf1 = new Conf(filterConfig.getServletContext(), inputStream, "urlrewrite.xml", "");
            urlRewriter = new UrlRewriter(conf1);
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    public UrlRewriter getUrlRewriter() {
        return urlRewriter;
    }

    @Override
    protected void destroyUrlRewriter() {
        if(urlRewriter!=null)
            urlRewriter.destroy();
    }

//    @Bean
//    public UrlRewriteFilter urlRewriteFilter(final ServletContext servletContext) throws ServletException {
//        UrlRewriteFilter urlRewriteFilter = new UrlRewriteFilter();
//        urlRewriteFilter.init(new javax.servlet.FilterConfig() {
//            private final Map<String, String> params = new HashMap<String, String>();
//            {
//                params.put("confPath", "urlrewrite.xml");
//            }
//
//            @Override
//            public String getFilterName() {
//                return "UrlRewriteFilter";
//            }
//
//            @Override
//            public ServletContext getServletContext() {
//                return servletContext;
//            }
//
//            @Override
//            public String getInitParameter(String name) {
//                return params.get(name);
//            }
//
//            @Override
//            public Enumeration<String> getInitParameterNames() {
//                return Collections.enumeration(params.keySet());
//            }
//        });
//
//        return urlRewriteFilter;
//    }
}
