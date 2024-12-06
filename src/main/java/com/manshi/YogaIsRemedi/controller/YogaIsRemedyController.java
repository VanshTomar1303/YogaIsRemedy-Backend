package com.manshi.YogaIsRemedi.controller;

import com.manshi.YogaIsRemedi.service.YogaIsRemedyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/yogaIsRemedy")
@CrossOrigin("http://localhost:5173/")
public class YogaIsRemedyController {
    @Autowired
    private YogaIsRemedyService service;

    @GetMapping("/{prompt}")
    public ResponseEntity<?> getYogaAsana(@PathVariable String prompt){
        return ResponseEntity.ok(
                service.getYogaAsana(prompt)
        );
    }
}
