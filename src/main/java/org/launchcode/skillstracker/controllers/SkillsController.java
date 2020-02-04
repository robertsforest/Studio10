package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping("")
    @ResponseBody
    public String landingPage(){
        return "<html>" +
                "<header>" +
                "<h1>" +
                "Skills Tracker" +
                "</h1>" +
                "</header>" +
                "<h2>" +
                "Here are some skills I'd like to learn" +
                "</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "<html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String inputForm(){
        return "<html>" +
                "<h5>Name:</h5>" +
                "<form method='post' action='/form'>" +
                "<input type='text' name='myName'/>" +
                "<div>My favorite language:</div>" +
                "<select name='param1'>" +
                "<option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option>" +
                "</select>" +
                "<div>My second favorite language:</div>" +
                "<select name='param2'>" +
                "<option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option>" +
                "</select>" +
                "<div>My third favorite language:</div>" +
                "<select name='param3'>" +
                "<option>Java</option>" +
                "<option>JavaScript</option>" +
                "<option>Python</option>" +
                "</select>" +
                "<div><input type='submit' value='Submit!'/></div>" +
                "</form>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String responseForm(@RequestParam String myName, @RequestParam String param1, @RequestParam String param2, @RequestParam String param3){
        return "<html>" +
                "<header>" +
                "<h1>" +
                "Skills Tracker" +
                "</h1>" +
                "</header>" +
                "<h2>" +
                myName + " would like to learn:" +
                "</h2>" +
                "<ol>" +
                "<li>" + param1 + "</li>" +
                "<li>" + param2 + "</li>" +
                "<li>" + param3 + "</li>" +
                "</ol>" +
                "<html>";

    }
}
