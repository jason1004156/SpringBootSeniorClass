package tw.keang.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public void save(){
		System.out.println("UserDao.Save()");
	}
}
