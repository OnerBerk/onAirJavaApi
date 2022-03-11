package fr.onAirApi.repository;

import fr.onAirApi.domain.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skills,Long> {
}
