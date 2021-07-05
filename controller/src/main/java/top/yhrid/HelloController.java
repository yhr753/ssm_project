package top.yhrid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试工程
 * @program: cs
 * @description:
 * @packagename: top.yhrid
 * @author: yanghongrong
 * @date: 2021-07-05 11:19
 **/
@CrossOrigin
@RestController
public class HelloController {

    @RequestMapping({"/","hello"})
    public String hello (){
        return "hello";
    }
}
