package com.lhy.son2;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class Son2Controller {
    @RequestMapping("/getName")
    public String getName() {
        return JSON.toJSONString(Arrays.asList("son2", "son2"));
    }
}
