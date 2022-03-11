package fr.onAirApi.repository;

import fr.onAirApi.domain.OnAirUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<OnAirUser, Long> {
}
