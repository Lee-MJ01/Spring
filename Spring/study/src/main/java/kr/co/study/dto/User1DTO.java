package kr.co.study.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User1DTO {
    private String user_id;
    private String name;
    private String birth;
    private int age;
}
