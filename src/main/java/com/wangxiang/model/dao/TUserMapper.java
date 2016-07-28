package com.wangxiang.model.dao;

import java.util.List;

import com.wangxiang.common.persistence.annotation.MyBatisDao;
import com.wangxiang.model.entity.TUser;

@MyBatisDao
public interface TUserMapper {
	List<TUser> getAll();
}
