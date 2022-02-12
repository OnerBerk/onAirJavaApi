package fr.onAirApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan("fr.onAirApi") aujourd'hui integrer dans springBootApplication permet de scanner la totalité du package
// @ComponentScan({"fr.onAirApi.controller, fr.onAirApi.service "})  scan seulement les package specifier
public class OnAirApiApplication {

    public static void main(String[] args) {
		SpringApplication.run(OnAirApiApplication.class, args);
    }

}
