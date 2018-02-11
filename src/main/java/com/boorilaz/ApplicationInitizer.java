package com.boorilaz;

import com.boorilaz.config.WebConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.awt.event.ComponentListener;

public class ApplicationInitizer implements WebApplicationInitializer {
    public static final String DISPATCHER = "dispatcher";


    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext cax = new AnnotationConfigWebApplicationContext();
        cax.register(WebConfig.class);

        servletContext.addListener(new ContextLoaderListener(cax));

        ServletRegistration.Dynamic servlet = servletContext.addServlet(DISPATCHER, new DispatcherServlet(cax));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
