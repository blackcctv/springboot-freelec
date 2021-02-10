package com.boot.study.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

// 이건 알고
@Getter
// 선언된 모든 final 필드가 포함된 생서자를 생성해줍니다.
// final이 없는 필드는 생성자에 포함되지 않습니다.
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
