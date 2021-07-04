package com.mart.api.web.controller;

import com.mart.api.web.service.MartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@Controller("/mart")
@RequiredArgsConstructor
public class MartContorller {

  private final MartService martService;

  @GetMapping("/")
  public ResponseEntity<Mono<String>> test() {
    return ResponseEntity.ok(martService.test());
  }
}
