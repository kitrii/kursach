package com.server.controllers;

import com.server.models.Bond;
import com.server.services.BondService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetPortfolioByUserName {

    @GetMapping("/getBonds")
    public Bond getBonds(@RequestParam String name) {
        BondService result = new BondService();
        return result.getBonds(name);
    }
}
