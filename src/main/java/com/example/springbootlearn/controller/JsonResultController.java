package com.example.springbootlearn.controller;

import com.example.springbootlearn.entity.User;
import com.example.springbootlearn.vo.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jsonresult")
public class JsonResultController {
    @RequestMapping("/user")
    public JsonResult<User> getUser(){
        User user = new User(1, "陈明", "123");
        return new JsonResult<>(user);
    }

    @RequestMapping("/list")
    public JsonResult<List> getUserList(){
        List<User> userList = new ArrayList<>();
        User user1 = new User(1, "陈明", "123");
        User user2 = new User(2, "wqeq", "123");
        userList.add(user1);
        userList.add(user2);
        return new JsonResult<>(userList, "获取用户列表成功");
    }

    @RequestMapping("/map")
    public JsonResult<Map> getUserMap(){
        Map<String, Object> map = new HashMap<>();
        User user = new User(1, "陈明", "123");
        map.put("作者信息", user);
        map.put("粉丝数量", 123);
        return new JsonResult<>(map);
    }
}
