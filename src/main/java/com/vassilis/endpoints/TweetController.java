package com.vassilis.endpoints;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.vassilis.model.Twitter;

@Controller
@RequestMapping({"/tweet"})
public class TweetController implements ServletContextAware {

	private ServletContext servletContext;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView displayTwitterForm(HttpServletRequest request) {
		
		if(request.getSession().getServletContext()==servletContext) {
			System.out.println("equal servletContext");
		}
		
		request.getSession().getServletContext().getInitParameter("companyName");
		
		System.out.println(servletContext.getAttribute("dbName"));
		
		System.out.println(servletContext.getInitParameter("companyName"));
		
		ModelAndView mav = new ModelAndView("display-twitter-form");
		
		Map<String, String> dbNames = new HashMap<String, String> ();
		dbNames.put("my-db", "db1");
		dbNames.put("my-db2", "db2");
		dbNames.put("my-db3", "db2");
		dbNames.put("my-db3", "db2");
		dbNames.put("my-db4", "db2");
		dbNames.put("my-db5", "db2");
		dbNames.put("my-db6", "db2");
		dbNames.put("my-db7", "db2");
		dbNames.put("my-db8", "db2");
		
		mav.addObject("db_names", dbNames);
		mav.addObject("twitter", new Twitter());
		
		return mav;
	}
	
	/**
	 * process the form-input passed into by the user
	 * @param twitter
	 * @param file
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST)
	public String processTweet(Twitter twitter, @RequestParam(value="file", required=false) MultipartFile file) {
		System.out.println("user: " + twitter.getUsername());
		System.out.println("says:" + twitter.getText());
		System.out.println("pass:" + twitter.getPassword());
			
		try {
			File fileStored = new File(servletContext.getRealPath("/")+"WEB-INF/resources/"+ file.getName());
			FileUtils.writeStringToFile(fileStored, IOUtils.toString(file.getInputStream()), "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//return the name of the view 
		return "display-twitter-form";
	}

	public void setServletContext(ServletContext servletContext) {
		this.servletContext=servletContext;
	}
}
