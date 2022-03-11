package fr.onAirApi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GlobalController {
    // annotation value retourne la valeur de la clef annocié dans properties seulement dans un environement spring
    @Value("${app.name: Default name}")
    private String appName;

    @GetMapping("/")
    public String getHome(){
        return appName;
    }
}
