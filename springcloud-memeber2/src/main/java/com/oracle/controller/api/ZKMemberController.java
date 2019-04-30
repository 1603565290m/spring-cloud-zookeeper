package com.oracle.controller.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: zookeeper会员控制器
 * @Author: admin
 * @CreateDate: 2019/4/30 10:01
 * @UpdateUser: admin
 * @UpdateDate: 2019/4/30 10:01
 * @UpdateRemark:
 * @Version: 1.0
 **/
@RestController
public class ZKMemberController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/getMember")
    public String getMember() {

        return "嗡嗡嗡嗡嗡嗡嗡嗡嗡嗡嗡嗡嗡嗡嗡:" + port;
    }
}
