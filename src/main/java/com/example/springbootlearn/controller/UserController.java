package com.example.springbootlearn.controller;

import com.example.springbootlearn.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class UserController {
    @RequestMapping("/user")
    public User getUser() {
        return new User(1, "陈明", "123456");
    }

    @RequestMapping("/list")
    public List<Object> getUserList() {
        List<Object> userList = new ArrayList<Object>();
        User user1 = new User(1, "陈有", "123456");
        User user2 = new User(2, "陈明", "123456");
        userList.add(user1);
        userList.add(user2);
        return userList;
    }

    @RequestMapping("/map")
    public Map<String, Object> getUserMap() {
        Map<String, Object> map = new HashMap<>();
        User user2 = new User(2, "陈明", "123456");
        map.put("作者信息", user2);
        map.put("粉丝数量", 123);
        return map;
    }

}
