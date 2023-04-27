package com.example.anekdotsender;

import com.example.anekdotsender.dto.AllAnekdotsResponse;
import com.example.anekdotsender.dto.AnekdotResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnekdotController {

    private final AnekdotService anekdotService;

    @Autowired
    public AnekdotController(AnekdotService anekdotService) {
        this.anekdotService = anekdotService;
    }

    @GetMapping(path = "/api/anekdot/random")
    public AnekdotResponse getAnekdot() {
        return new AnekdotResponse(anekdotService.getRandom());
    }

    @GetMapping(path = "/api/anekdot/all")
    public AllAnekdotsResponse getAll() {
        return new AllAnekdotsResponse(anekdotService.getAll());
    }
}
