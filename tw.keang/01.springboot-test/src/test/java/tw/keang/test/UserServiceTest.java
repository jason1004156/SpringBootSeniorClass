package tw.keang.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tw.keang.Application;
import tw.keang.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)//@RunWith: 讓junit和spring整合
@SpringBootTest(classes={Application.class})
public class UserServiceTest {
	
	@Resource
	private UserService userService;
	
	@Test
	public void testSave(){
		userService.save();
	}
	
	
	
}
