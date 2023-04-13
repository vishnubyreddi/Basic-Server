package com.example.BasicServer;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @PostMapping(value = "/test")
    public ResponseEntity<String> example(@RequestBody String fromClient) {
        String responseBody= "Welcome";
        return ResponseEntity.ok(responseBody);
    }
}
