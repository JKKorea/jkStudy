package me.jk;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter init");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter");
        filterChain.doFilter(servletRequest, servletResponse);  //다음 필터로 연결을 해줘야한다.
        //만약 마지막 필터일 경우 다음 연결은 servlet이다.
    }

    @Override
    public void destroy() {
        System.out.println("Filter Destroy");
    }
}