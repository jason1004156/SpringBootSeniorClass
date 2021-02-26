package tw.keang.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import tw.keang.dao.UserDao;

@Service
public class UserService {
	@Resource
	private UserDao userDao;
	
	public void save(){
		userDao.save();
	}
	
}
