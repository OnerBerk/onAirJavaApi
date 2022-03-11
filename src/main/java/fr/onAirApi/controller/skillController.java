package fr.onAirApi.controller;

import fr.onAirApi.domain.Skills;
import fr.onAirApi.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/skills")
public class skillController {
    @Autowired
    private SkillRepository skillRepository;

    @GetMapping("/")
    public List<Skills> findAllSkills() {
        return skillRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Skills> findSkillById(@PathVariable(value = "id") long id) {
        Optional<Skills> skill = skillRepository.findById(id);
        if (skill.isPresent()) {
            return ResponseEntity.ok().body(skill.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Skills saveSkill(@Validated @RequestBody Skills skill) {
        return skillRepository.save(skill);
    }
}
