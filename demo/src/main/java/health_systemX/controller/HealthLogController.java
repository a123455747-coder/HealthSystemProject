package health_systemX.controller;

import health_systemX.model.HealthLog;
import health_systemX.service.RiskAssessmentService;
import health_systemX.repository.HealthLogRepository; // 這一行一定要加
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/health-logs")
public class HealthLogController {
    @Autowired
    private RiskAssessmentService service;
    @Autowired
    private HealthLogRepository repo; // 這一行一定要加

    @PostMapping
    public HealthLog addLog(@RequestBody HealthLog log) {
        log.setRiskLevel(service.calculateRisk(log.getSleepHours(), log.getSteps(), log.getMoodScore()));
        return repo.save(log); // 這樣資料才會存入資料庫
    }
}
