package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/docker")
    public String dockerDemo() {
        return "Приложение работает в Docker! 🐳";
    }
}