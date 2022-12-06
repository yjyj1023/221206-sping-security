package com.springsecurity.controller;

import com.springsecurity.domain.dto.UserLoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @PostMapping
    public ResponseEntity<String> writeReview(Authentication authentication){
        return ResponseEntity.ok().body(authentication.getName() + "님의 리뷰등록이 완료 되었습니다.");
    }
}
