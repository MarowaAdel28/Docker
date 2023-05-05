package gov.iti.jets.service;

// import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.iti.jets.dao.UserDao;
import gov.iti.jets.entity.User;

@Service("userService")
public class UserService {

    @Autowired
    UserDao userDao;

    public boolean insert(User user) {
        // Random rand = new Random();
        // int randomNum = rand.nextInt();
        // user.setId(randomNum);
         userDao.insert(user);
        //  userDao.insert(user);   
         return true;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
}
