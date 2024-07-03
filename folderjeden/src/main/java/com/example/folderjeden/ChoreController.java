package com.example.folderjeden;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChoreController {

    @GetMapping("/plants/chore")
    public ResponseEntity<?> getPlants() {
        return ResponseEntity.ok("Hello from plants");
    }
//    @GetMapping("/plants/chore/show")
//    public List<Plants> showAllPlants() {
//
//    }
}
