package com.monitor.mapper.user;


import com.cloud.core.IMapper;
import com.monitor.domain.dto.user.PanoramicUserInfo;
import com.monitor.model.user.Member;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author summer
 */
public interface MemberMapper extends IMapper<Member> {

}