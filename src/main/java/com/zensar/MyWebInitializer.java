package com.zensar;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { MvcConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { DispatcherConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}


//    @Override
//    protected WebApplicationContext createRootApplicationContext() {
//            return null;
//    }
// 
//    @Override
//    protected WebApplicationContext createServletApplicationContext() {
//            XmlWebApplicationContext cxt = new XmlWebApplicationContext();
//            cxt.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
//            return cxt;
//    }
	
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		XmlWebApplicationContext appContext = new XmlWebApplicationContext();
//		appContext.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
//
//		ServletRegistration.Dynamic registration = servletContext.addServlet("rootDispatcher",
//				new DispatcherServlet(appContext));
//		registration.setLoadOnStartup(1);
//		registration.addMapping("/");
//	}
	 
}
