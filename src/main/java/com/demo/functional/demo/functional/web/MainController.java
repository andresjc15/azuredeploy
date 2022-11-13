package com.demo.functional.demo.functional.web;

import com.demo.functional.demo.functional.entity.TestResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping
    public Mono<TestResponse> getValues (@RequestParam String value) {
        TestResponse response = new TestResponse("1", value);
        List<String> values = Arrays.asList(value);
        return Mono.just(response);
    }

}
