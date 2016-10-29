package ru.sbt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

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

    @RequestMapping(params = "action=start")
    public void start(HttpSession session) {

    }
}