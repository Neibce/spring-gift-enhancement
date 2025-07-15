package gift.token.repository;

import gift.token.entity.RefreshToken;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepositoryJpa extends JpaRepository<RefreshToken, Long> {

    Optional<RefreshToken> findByToken(String refreshTokenString);
}
