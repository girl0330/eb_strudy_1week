package com.study.servletBoardProject;

import jakarta.servlet.annotation.WebListener;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.*;
import java.io.InputStream;

@WebListener
public class MyBatisListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sce.getServletContext().setAttribute("sqlSessionFactory", sqlSessionFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
