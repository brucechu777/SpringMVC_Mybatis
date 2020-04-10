package com.bruce.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	    @Autowired
	    private UserDaoImpl userDaoImpl;
	    
	    public String getUserName() {
	        
	        return userDaoImpl.getUser().get(0).getUserName();
	    }

}
