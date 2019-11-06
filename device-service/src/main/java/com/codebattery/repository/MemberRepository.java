package com.codebattery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codebattery.model.Device;
import com.codebattery.model.Member;

import java.util.List;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long>  {
}
