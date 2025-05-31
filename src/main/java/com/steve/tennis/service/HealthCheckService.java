package com.steve.tennis.service;

import com.steve.tennis.ApplicationStatus;
import com.steve.tennis.HealthCheck;
import com.steve.tennis.repository.HealthCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    @Autowired
    private HealthCheckRepository healthCheckRepository;

    public HealthCheck healthCheck() {
        Long applicationConnections = healthCheckRepository.countApplicationConnections();
        if (applicationConnections > 0) {
            return new HealthCheck(ApplicationStatus.OK, "Welcome to Dyma Tennis!");
        } else {
            return new HealthCheck(ApplicationStatus.KO, "Dyma Tennis is not fully functional, please check your configuration.");
        }
    }
}
