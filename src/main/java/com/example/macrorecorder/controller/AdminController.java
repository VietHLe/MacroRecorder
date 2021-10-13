package com.example.macrorecorder.controller;

import com.example.macrorecorder.model.AdminModel;
import com.example.macrorecorder.model.ExpertModel;
import com.example.macrorecorder.service.AdminService;
import com.example.macrorecorder.service.ExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminRepo;
    @Autowired
    private ExpertService expertRepo;

    @GetMapping("admin")
    public List<AdminModel> adminGetAll() {
        return adminRepo.adminGetAll();
    }
    @PostMapping("admin")
    public AdminModel create(@RequestBody AdminModel admin){
        return adminRepo.adminCreate(admin);
    }
    @DeleteMapping("admin/{id}")
    public void delete(@PathVariable Long id){
        adminRepo.delete(id);
    }
    @PostMapping("admin/expert")
    public ExpertModel create(@RequestBody ExpertModel expert){
        return expertRepo.expertCreate(expert);
    }
}
