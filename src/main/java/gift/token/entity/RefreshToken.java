package gift.token.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class RefreshToken {

    public static final Duration TTL = Duration.ofDays(365);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Column(nullable = false, updatable = false, unique = true)
    private String token;

    @NotNull
    @Column(nullable = false, updatable = false)
    private UUID memberUuid;

    @NotNull
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @NotNull
    @Column(nullable = false, updatable = false)
    private LocalDateTime expirationDate;

    public RefreshToken() {
    }

    public RefreshToken(String token, UUID memberUuid, LocalDateTime createdAt,
            LocalDateTime expirationDate) {
        this.token = token;
        this.memberUuid = memberUuid;
        this.createdAt = createdAt;
        this.expirationDate = expirationDate;
    }

    public RefreshToken(UUID memberUuid) {
        this.token = UUID.randomUUID().toString().replace("-", "");
        this.memberUuid = memberUuid;
        this.createdAt = LocalDateTime.now();
        this.expirationDate = this.createdAt.plusDays(RefreshToken.TTL.toDays());
    }

    public String getToken() {
        return token;
    }

    public UUID getMemberUuid() {
        return memberUuid;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }
}
