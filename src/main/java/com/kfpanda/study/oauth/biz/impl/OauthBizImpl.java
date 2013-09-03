package com.kfpanda.study.oauth.biz.impl;

import org.springframework.stereotype.Service;

import com.kfpanda.study.oauth.biz.OauthBiz;

/**
 * <b>ClassName:<b> InfoResourceServiceImpl.java
 * <br><b>Description:<br>
 * 产品接口实现类
 * @Author: liuhualuo@163.com
 * @Date: 2012-8-10 上午9:41:59
 */
@Service("oauthBiz")
public class OauthBizImpl implements OauthBiz {

    public boolean checkSignature(){
    	return true;
	}
    
    @Override
    public String findSecret() {
    	return null;
    }
    
    public String findSecretDetail() {
    	return null;
    }
    
}
