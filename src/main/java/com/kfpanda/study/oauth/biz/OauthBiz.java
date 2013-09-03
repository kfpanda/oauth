package com.kfpanda.study.oauth.biz;

/**
 * <b>ClassName:<b> ProductService.java
 * <br><b>Description:<br>
 * 密码接口
 * @Author: liuhualuo@163.com
 * @Date: 2012-8-10 上午9:41:26
 */
public interface OauthBiz {
	
	boolean checkSignature();
	
	String findSecret();
	
	String findSecretDetail();
	
}
