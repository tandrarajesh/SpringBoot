package com.mphasis.controller;

import com.mphasis.controller.com.mphasis.service.CurrencyServiceConfiguration;
import com.mphasis.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyController {

    @Autowired
    CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency")
    public CurrencyServiceConfiguration RetrieveAllCourses() {
        return configuration;
    }
}