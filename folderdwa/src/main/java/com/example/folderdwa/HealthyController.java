package com.example.folderdwa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthyController {

    @GetMapping("/plants/zdrowe")
    public String getPlants() {
        return "Hello from healthy plants";
    }
}
