package com.vassilis.endpoints;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.ModelAndView;

import com.vassilis.model.Employee;
import com.vassilis.service.EmployeeService;
import com.vassilis.service.TwitterService;
import com.vassilis.service.TwitterServiceImpl;

@Controller
public class HomeController implements ServletContextAware {
	private static final int DEFAULT_TWEETS_PER_PAGE=25;
	private ServletContext servletContext; 
	static Logger log = Logger.getLogger(HomeController.class);
	
	@Autowired
	private TwitterService twitterService;
	
	@Autowired
	private EmployeeService employeeService;

	//DispacherServlet, front controller, consults one or more handler mappers
	//By default the DefaultAnnotationHandlerMapping bean is used.
	//This way, http requests mapped to controller's methods. 
	@RequestMapping({"/home"})
	public ModelAndView showHomePage(HttpServletRequest request) {
		//model is filled in by controller.
		ModelAndView mav = new ModelAndView("home-tile");
		
		mav.addObject("tweets", twitterService.getRecentTweets(DEFAULT_TWEETS_PER_PAGE));
		
		System.out.println(servletContext.getInitParameter("myContextParam"));
			
		//returns the name of the concrete page-tile that will be used to display the results to the user.
		//This tile (look at apache tiles definition file extends a main template. Tiles framework will glue
		//everything together
		return mav; 
	}
	
	@RequestMapping({"/home/mybatis"})
	public ModelAndView testMyBatis(HttpServletRequest request) {
		
		log.info("HTTP call for testing mybatis....");
		
		ModelAndView mav = new ModelAndView("home-tile");
		
		Employee employee = employeeService.getEmployee();
		
		System.out.println(employee);
		
		log.info("HTTP call for testing mybatis....");
		
		return mav;
	}
	
	public void setTwitterService(TwitterServiceImpl twitterService) {
		this.twitterService = twitterService;
	}

	public void setServletContext(ServletContext servletContext) {
		this.servletContext=servletContext;
	}
}
