package com.boot.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// 메인 클래스, SpringBootApplication 으로 인해
// 스프링 Bean 읽기와 생성을 모두 자동으로 설정
// 항상 프로젝트 최상단에 위치해야만 합니다.
@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
