package com.kfpanda.study.oauth.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@RequestMapping("/secu")
public class OauthWsAction extends BaseAction{
	
	private final Logger logger = Logger.getLogger(OauthWsAction.class);
	
	@RequestMapping(value="/pass",method=RequestMethod.GET)
	public @ResponseBody Object checkAuth(@RequestParam(value = "signature") String signature) {
		logger.debug("sdfsdfsdfsf");
		boolean authPass = true;//oauthBiz.checkSignature();
		System.out.println("-----" + authPass);
		return "success";
	}
	
    
}