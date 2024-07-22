package teresa.bat.desafio_uol_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teresa.bat.desafio_uol_backend.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
