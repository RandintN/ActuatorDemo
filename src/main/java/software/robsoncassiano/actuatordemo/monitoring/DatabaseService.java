package software.robsoncassiano.actuatordemo.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DatabaseService implements HealthIndicator {

    @Override
    public Health health() {
        String DATABASE_SERVICE = "Database Service";

        if (isDatabaseGood()) {

            final Map<String, String> values = new HashMap<>();
            values.put("oi", "chapa");
            values.put("odfi", "chapa");
            values.put("odfdfi", "chapa");
            values.put("dfdefoi", "chapa");
            return Health
                    .up()
                    .withDetails(values)
                    .build();
        }
        return Health
                .down()
                .withDetail(DATABASE_SERVICE, "Service not runninig")
                .build();
    }

    private Boolean isDatabaseGood() {
        return true;
    }
}
