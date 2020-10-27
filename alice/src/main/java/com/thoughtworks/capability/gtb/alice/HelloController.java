package com.thoughtworks.capability.gtb.alice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Value("${BOB_API_URL}")
    private String apiUrl;

    @Value("${BOB_API_PORT}")
    private String apiUrlPort;

    @GetMapping("/hello")
    public String hello() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://" + apiUrl + ":" + apiUrlPort + "/hello", String.class);
        return response.getBody();
    }
}
