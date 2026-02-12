package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
// 프론트엔드 배포 주소가 정해지기 전까지는 모든 접속을 허용()합니다.
@CrossOrigin(origins = "*")
public class TestController {

  @GetMapping("/open-api/test")
  public Map<String, Object> test() {
    Map<String, Object> response = new HashMap<>();
    response.put("message", "스프링 부트 서버 연결 성공!");
    response.put("status", "success");
    response.put("data", new String[]{"데이터1", "데이터2", "데이터3"});
    return response;
  }
}