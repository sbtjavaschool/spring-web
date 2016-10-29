package ru.sbt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @Autowired
    private UserPageDao userPageDao;

    @ResponseBody
    @RequestMapping(value = "{userId}/{age}")
    public UserPage getUserInfo(@PathVariable("userId") String userId) {
        return userPageDao.findById(userId);
    }
}