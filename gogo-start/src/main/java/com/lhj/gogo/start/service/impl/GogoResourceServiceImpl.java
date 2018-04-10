package com.lhj.gogo.start.service.impl;

import org.springframework.stereotype.Service;
import com.lhj.gogo.basic.model.GogoResource;
import com.lhj.gogo.basic.service.GogoResourceService;

@Service("gogoResourceService")
public class GogoResourceServiceImpl implements GogoResourceService {

	@Override
	public int insertSelective(GogoResource record) {
		System.out.println("成功！");
		return 0;
	}

}
