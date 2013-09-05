package com.kfpanda.study.oauth.action;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@RequestMapping("/photos")
public class PhotoWsAction extends BaseAction{
	
	private final Logger logger = Logger.getLogger(PhotoWsAction.class);
	
	@RequestMapping(value="/one",method=RequestMethod.GET)
	public @ResponseBody Object photo() {
		logger.debug("photos");
		boolean authPass = true;//oauthBiz.checkSignature();
		System.out.println("-----" + authPass);
		return "success";
	}
	
    
}