package ru.sbt;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserPageDaoImpl implements UserPageDao {
    @Override
    public UserPage findById(String userId) {
        return new UserPage("Julia", "SPB", new Date());
    }
}
