package kr.co.ch06.entity.shop;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "shop_customer")
public class Customer {
    @Id
    private String custId;
    private String Name;
    private int age;
    private String addr;

    @CreationTimestamp
    private LocalDateTime regDate;

    // 추가필드
    @Transient // 테이블 컬럼 속성에서 제외시키는 어노테이션
    private long orderCount;
}
