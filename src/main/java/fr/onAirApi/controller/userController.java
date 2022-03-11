package fr.onAirApi.controller;

import fr.onAirApi.domain.OnAirUser;
import fr.onAirApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users") // RequestMapping base url de requete
public class userController {
    @Autowired
    private UserRepository userRepository;

    //@RequestMapping(value = "/get",method = RequestMethod.GET) meme chose que la ligne en dessous
    @GetMapping("/")
    public List<OnAirUser> findallUser() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OnAirUser> findUserById(@PathVariable(value = "id") long id) {
        Optional<OnAirUser> user = userRepository.findById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok().body(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public OnAirUser saveUser(@Validated @RequestBody OnAirUser user) {
        return userRepository.save(user);
    }
}
