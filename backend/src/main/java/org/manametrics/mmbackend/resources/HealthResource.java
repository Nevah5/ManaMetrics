package org.manametrics.mmbackend.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthResource {
    /**
     * Health check endpoint to verify if the backend is running.
     * @return a simple "pong!" message.
     */
    @GetMapping("/ping")
    public String ping() {
        return "pong!";
    }
}
