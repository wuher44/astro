package com.example.astro;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class AstroController {
    public final AstronomyApiClient astronomyAPIclient;

    public AstroController(AstronomyApiClient astronomyApiClient) {
        this.astronomyAPIclient = astronomyApiClient;
    }

    @GetMapping("/astro")
    public String getAstro(Model model) {

        LocalDate date = LocalDate.now();
        model.addAttribute("astroD", astronomyAPIclient.getData(date, 50.2466, 19.0043));
        model.addAttribute("selectedDate", date);
        return "astro";
    }

    @PostMapping("/astro")
    public String getDate(@RequestParam String date, Model model) {

        //  LocalDate date = LocalDate.now();
        model.addAttribute("astroD", astronomyAPIclient.getData(LocalDate.parse(date), 50.2466,
                19.0043));
        model.addAttribute("selectedDate", date);
        return "astro";
    }
}

