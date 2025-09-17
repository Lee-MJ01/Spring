package kr.co.ch03.dto;

import lombok.*;

// lombok
@Getter
@Setter
@ToString
@NoArgsConstructor // 매개변수 없는 기본 생성자
@AllArgsConstructor // 매개변수 있는 모든 생성자
@Builder            // JPA할 때 Builder로 초기화 하는 경우가 있는 때 그때 사용
public class UserDTO {
    private String uid;
    private String name;
    private String birth;
    private int age;



}
