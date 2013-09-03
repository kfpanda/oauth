package com.kfpanda.study.oauth.action;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kfpanda.study.oauth.action.OauthWsActionTest;

@WebAppConfiguration()
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml", "classpath:spring/spring-mvc.xml"})
public class OauthWsActionTest extends AbstractTestNGSpringContextTests{
	
	private final Logger logger = Logger.getLogger(OauthWsActionTest.class);
	
	@Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;
    
    @Autowired
    private OauthWsAction oauthWsAction;

    @BeforeMethod
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
//    	mockMvc = MockMvcBuilders.standaloneSetup(secretWsAction).build();
    }
    
    @Test
	public void checkAuth() throws Exception{
		ResultActions result = this.mockMvc.perform(get("/secu/pass")
				.param("signature", "signature"));
		MockHttpServletResponse response = result.andReturn().getResponse();
		System.out.println(response.getContentAsString());
	}
    
}
