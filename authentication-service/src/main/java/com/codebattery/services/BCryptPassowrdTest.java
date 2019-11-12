package com.codebattery.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPassowrdTest {

    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	public static void main(String[] args) {
		String password = "11111111";
		String password2 = "{bcrypt}" + passwordEncoder.encode(password);
		
		System.out.println(password2);
	}

}
