package com.codebattery.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebattery.model.Member;
import com.codebattery.repository.MemberRepository;

@Service
public class UserService {
    @Autowired
    private MemberRepository memberRepository;

    public Member login(Long id) {
    	return memberRepository.findOne(id);
    }
    
}
