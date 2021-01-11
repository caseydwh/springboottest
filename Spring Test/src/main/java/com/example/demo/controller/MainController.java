package com.example.demo.controller;
import h2Explore.domain.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.*;

@Controller
public class MainController {

    @GetMapping("")
        public String viewHomePage(){
        return "index";
        }

    @GetMapping("/apollosoyuzhistory")
    public String apollosoyuzhistory() {
        return "apollosoyuzhistory"; }

    @GetMapping("/launchvehicles")
    public String launchvehicles() {
        return "launchvehicles"; }

    @GetMapping("/pilotprofiles")
    public String pilotprofiles() {
        return "pilotprofiles"; }

    @GetMapping("/registration")
    public String registration() {
        return "registration"; }

    @GetMapping("/index")
    public String index(){
        return "index";}

    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "register_form";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user) {
        System.out.println(user);
        return "register_success"; }
    }


