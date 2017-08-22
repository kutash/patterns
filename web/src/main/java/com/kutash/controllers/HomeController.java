package com.kutash.controllers;

import com.kutash.entity.EnglishPattern;
import com.kutash.service.PatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PatternService patternService;

    /*@RequestMapping(value = "/", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<EnglishPattern>> showHome() {
        List<EnglishPattern> list = patternService.getEnglishPatterns();
        return new ResponseEntity<List<EnglishPattern>>(list, HttpStatus.OK);
    }*/

    @RequestMapping("/")
    public String home() {
        return "/static/index";
    }
}
