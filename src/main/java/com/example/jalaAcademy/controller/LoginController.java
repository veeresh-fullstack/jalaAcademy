package com.example.jalaAcademy.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    // Show login page
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

    // Handle login form submission
    @PostMapping("/login")
    public String doLogin(@RequestParam String username,
                          @RequestParam String password,
                          HttpSession session) {
        // Simple hardcoded login check
        if ("admin".equals(username) && "admin123".equals(password)) {
            session.setAttribute("username", username); // store login in session
            return "redirect:/employees"; // after login go to employees list
        }
        // Invalid login
        return "redirect:/login?error=true";
    }

}
