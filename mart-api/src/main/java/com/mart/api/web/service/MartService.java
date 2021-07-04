package com.mart.api.web.service;

import com.mart.api.web.repository.mongo.MartMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MartService {

  private final MartMongoRepository martMongoRepository;

  public Mono<String> test() {
    return Mono.just("test");
  }

}
