package com.jeronimo.service_with_observability.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    private final RestTemplate restTemplate;

    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("test")
    public ResponseEntity<String> testOk() {
        logger.info("TestController.testOk called");
        return this.restTemplate.postForEntity("https://httpbin.org/post", "Everything is OK", String.class);
    }
}
