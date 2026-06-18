package health_systemX.repository;

import health_systemX.model.HealthLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthLogRepository extends JpaRepository<HealthLog, Long> {
}
