package ru.grebnev.a.phonebook.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Slf4j
@Controller
public class AuthController {

    //TODO удалить
    @GetMapping("/hello")
    @ResponseBody
    public String home(Principal principal) {
        log.info("User {} get hello page.", SecurityContextHolder.getContext().getAuthentication().getName());
        log.info("Principal {}", principal.getName());
        return "Hello, World!";
    }

    @GetMapping("/auth/login")
    public String loginPage() {
        return "/auth/login";
    }

    @GetMapping("/auth/create_user")
    public String addAccountPage() { return "/auth/create_user"; }
}
