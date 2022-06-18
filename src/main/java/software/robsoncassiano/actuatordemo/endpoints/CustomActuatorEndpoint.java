package software.robsoncassiano.actuatordemo.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Endpoint(id = "custom")
public class CustomActuatorEndpoint {

    @ReadOperation
    public Map<String, String> customEndpoint(String name) {
        return Map.of(name, "Bilionário da Tecnologia");
    }
}
