package com.thornBird.sbd.modules.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thornBird.sbd.modules.test.vo.ConfigBean;

@Controller
public class TestController {
	
	@Value("${server.port}")
	private int port;
	@Value("${com.thornBird.name}")
	private String name;
	@Value("${com.thornBird.age}")
	private int age;
	@Value("${com.thornBird.desc}")
	private String desc;
	@Value("${com.thornBird.random}")
	private String random;
	
	@Autowired
	private ConfigBean configBean;
	/**
	 * http://127.0.0.1/test/config
	 */
	@RequestMapping("/test/config")
	@ResponseBody
	public String configTest(){
		StringBuffer sb = new StringBuffer();
		sb.append(port).append("---")
			.append(name).append("---")
			.append(age).append("---")
			.append(desc).append("---")
			.append(random).append("---");
		sb.append(configBean.getName()).append("---")
			.append(configBean.getAge()).append("---")
			.append(configBean.getDesc()).append("---")
			.append(configBean.getRandom()).append("---");
		return sb.toString();
	}
	
	@RequestMapping("/test/appDesc")
	@ResponseBody
	public String getAppDesc(){
		return "Hello world.";
	}
	
}
