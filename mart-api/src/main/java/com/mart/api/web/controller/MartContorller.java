package com.mart.api.web.controller;

import com.mart.api.web.service.MartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/v1/mart", produces = "application/json")
@RequiredArgsConstructor
public class MartContorller {

  private final MartService martService;

  @GetMapping("/test")
  public ResponseEntity<Mono<String>> test() {
    return ResponseEntity.ok(martService.test());
  }
}
