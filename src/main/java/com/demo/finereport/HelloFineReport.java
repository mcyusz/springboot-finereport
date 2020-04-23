package com.demo.finereport;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2020/3/22
 * Time: 12:58 下午
 */
@RestController
public class HelloFineReport {


    @GetMapping("/hello")
    public String hello() {
        return "hello beer!";
    }
}
