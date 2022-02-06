package fr.onAirApi.controller;

import fr.onAirApi.response.UserResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users/") // RequestMapping base url de requete
public class userController {
    @Value("${app.name: Default name}")
// annotation value retourne la valeur de la clef annocié dans properties seulement dans un enviromnement spring
    private String appName;

    @GetMapping("/name") // GetMapping reqcupere la base est rajoute un endpoint
    public String getAppName() {
        return appName;
    }

    //@RequestMapping(value = "/get",method = RequestMethod.GET) meme chose que la ligne en dessous
    @GetMapping("/get")
    public UserResponse getStudent() {
        UserResponse userResponse = new UserResponse(1, "Öner", "Berk"); // la lib jackson de spring va automatiquement retourner un json
        return userResponse;
    }
}
