package com.raajan.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitilizer{   /*implements   WebApplicationInitializer // this can be done but it can be  replaced by 
	short code of springframework which is done in LCAppInitilizer*/

	public void onStartup(ServletContext servletContext) throws ServletException {

		// System.out.println("hi ..................");

//		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
//		webApplicationContext.setConfigLocation("classpath:application-config.xml");

		// the above code is used if we have application-config.xml in main/resources

		AnnotationConfigWebApplicationContext webApplicationConfig = new AnnotationConfigWebApplicationContext();
		webApplicationConfig.register(LoveCalculatorAppConfig.class);
		// create the Dispatcher servlet object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationConfig);

		// Register Dispatcher Servlet with servlet context
		ServletRegistration.Dynamic myCustumDispatcherServlet = servletContext.addServlet("myDispatcherServlet",
				dispatcherServlet);

		myCustumDispatcherServlet.setLoadOnStartup(1);
		myCustumDispatcherServlet.addMapping("/mywebsite.com/*");
	}

}
