package com.example.macrorecorder.controller;

import com.example.macrorecorder.service.AdminService;
import com.example.macrorecorder.service.ExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminRepo;
}