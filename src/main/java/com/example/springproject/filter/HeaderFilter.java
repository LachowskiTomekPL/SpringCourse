package com.example.springproject.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Component
public class HeaderFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletResponse newResponse = (HttpServletResponse) servletResponse;
        newResponse.addHeader("nowy","haeder");
        filterChain.doFilter(servletRequest,newResponse);
    }
}
