package com.hoangtien2k3.testdeploy;

import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class controller {
    @GetMapping("/title/{name}")
    @ResponseBody
    private String titleString(@PathVariable("name") String name) {
        System.out.println("hello: " + name);
        return "Hello " + name;
    }
}
