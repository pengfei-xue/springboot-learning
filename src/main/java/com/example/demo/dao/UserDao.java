package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDao {

    @Autowired JdbcTemplate jdbcTemplate;

    static class UserRowMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User u = new User();
            u.setId(resultSet.getLong("id"));
            u.setName(resultSet.getString("name"));
            u.setDepartmentId(resultSet.getLong("department_id"));
            u.setCreateTime(resultSet.getDate("create_time"));
            return u;
        }
    }

    public User getUserById(long id) {
        System.out.println("in id: " + id);
        String sql = "select * from user where id = ?";
        try {
            User u = jdbcTemplate.queryForObject(sql, new UserRowMapper(), id);
            return u;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
