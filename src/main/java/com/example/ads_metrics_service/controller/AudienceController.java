package com.example.ads_metrics_service.controller;

import com.example.ads_metrics_service.model.Audience;
import com.example.ads_metrics_service.model.ViewsByMonth;
import com.example.ads_metrics_service.repository.AudienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/audience")
@CrossOrigin(origins = "http://localhost:3000")
public class AudienceController {
    @Autowired
    private AudienceRepository audienceRepository;

    @GetMapping
    public List<Audience> getAllProducts() {
        return audienceRepository.findAll();
    }

    @PostMapping
    public Audience createProduct(@RequestBody Audience audience) {
        return audienceRepository.save(audience);
    }
}
