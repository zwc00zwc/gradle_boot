package web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhengwenchao
 * @Date: 2020 2020-07-08 16:03
 */
@RestController
public class HomeController {

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }
}
