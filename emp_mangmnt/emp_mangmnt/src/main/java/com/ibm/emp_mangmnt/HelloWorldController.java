package com.ibm.emp_mangmnt;

import com.ibm.emp_mangmnt.response.APIResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    //"hello world" endpoint
    @GetMapping("/hello")
    public ResponseEntity<APIResponse<String>> helloWorld() {
        return ResponseEntity.ok(APIResponse.success("Request successful", "Hello World!"));
    }
}
