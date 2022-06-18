package software.robsoncassiano.actuatordemo.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class LoggerService implements HealthIndicator {

    @Override
    public Health health() {
        String LOGGER_SERVICE = "Logger Service";
        if (isLoggerServiceGood()) {
            return Health
                    .up()
                    .withDetail(LOGGER_SERVICE, "Service is running")
                    .build();
        }
        return Health
                .down()
                .withDetail(LOGGER_SERVICE, "Service not runninig")
                .build();
    }

    private Boolean isLoggerServiceGood() {
        return false;
    }
}
