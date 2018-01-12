package org.gogo.basic;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lhj.gogo.basic.model.GogoUser;
import com.lhj.gogo.basic.service.UserService;
@Controller
public class UserTest {
	@Autowired
	private UserService userService;
	
	@Test
	public void test() {
		GogoUser user = new GogoUser();
		user.setUserId(1L);
		user.setUserType("l");
		user.setState("10A");
		userService.insertSelective(user);
	}
	
	
}
