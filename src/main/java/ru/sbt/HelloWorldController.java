package ru.sbt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/start")
public class HelloWorldController {

    @ResponseBody
    @RequestMapping(params = "action=hello")
    public String createAccount(Person person) {
        return "Hello" + person.getName();
    }

    @ResponseBody
    @RequestMapping(params = "action=calc")
    public int calc(int a, int b) {
        return a + b;
    }
}