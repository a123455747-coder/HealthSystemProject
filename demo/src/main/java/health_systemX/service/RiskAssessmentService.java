package health_systemX.service;
import org.springframework.stereotype.Service;
@Service
public class RiskAssessmentService {
    public String calculateRisk(Double sleep, Integer steps, Integer mood) {
        if (sleep < 5.5) return (steps < 3500) ? "高風險" : "中風險";
        if (sleep <= 7.0) return (mood < 5) ? "中風險" : "低風險";
        return "低風險";
    }
}
