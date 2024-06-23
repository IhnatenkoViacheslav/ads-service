package com.example.ads_metrics_service.controller;

import com.example.ads_metrics_service.model.ViewsByMonth;
import com.example.ads_metrics_service.repository.AdsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/views")
@CrossOrigin(origins = "http://localhost:3000")
public class AdsController {

    @Autowired
    private AdsRepository adsRepository;

    @GetMapping
    public List<ViewsByMonth> getAllProducts() {
        return adsRepository.findAll();
    }
    @PostMapping
    public ViewsByMonth createProduct(@RequestBody ViewsByMonth viewsByMonth) {
        return adsRepository.save(viewsByMonth);
    }

}
