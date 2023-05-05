package gov.iti.jets.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import gov.iti.jets.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository("userDao")
public class UserDao {

    @PersistenceContext 
    EntityManager entityManager;

    // public int count() {
    //     String sql = "select count(*) from user";
    //     int rowCount = jdbcTemplate.queryForObject(sql, Integer.class);
    //     return rowCount;
    // }

    @Transactional
    public boolean insert(User user) {
        
        entityManager.persist(user);

        return true;
    }

    // public List<User> retriveAll() {
    //     String sql = "select * from user";
    //     List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
    //     return users;
    // }

}
