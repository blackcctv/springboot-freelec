package com.boot.study.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
// JPA Enity class들이 이걸 상속하면 필드를 칼럼으로 인식하도록 만듬
@MappedSuperclass
// Auditing 기능을 포함시킨다.
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {
    // Entity가 생성되어 저장될 때 시간이 자동으로 저장됩니다.
    @CreatedDate
    private LocalDateTime createDate;
    // 값을 변경할 때 자동으로 저장됩니다.
    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
