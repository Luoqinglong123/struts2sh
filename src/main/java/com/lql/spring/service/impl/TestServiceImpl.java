package com.lql.spring.service.impl;

import org.springframework.stereotype.Service;

import com.lql.spring.service.TestService;
@Service
public class TestServiceImpl implements TestService {

	@Override
	public String getHelloStr() {
		return "Hello World!";
	}

}
