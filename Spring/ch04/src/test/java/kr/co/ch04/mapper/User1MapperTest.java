package kr.co.ch04.mapper;

import kr.co.ch04.dto.User1DTO;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class User1MapperTest {

    @Autowired // 권장되지 않는 필드 주입 방법이지만 테이스트이기에 써도 ㄱㅊ(1회성)
    private User1Mapper user1Mapper;

    private String userid = "abc2001";

    @Order(1)
    @DisplayName("삽입 테스트")
    @Test
    void insert() {

        // Given - 테스트를 실행하기 위한 준비 단계
        User1DTO user1DTO = User1DTO.builder()
                            .user_id(userid)
                            .name("고말석")
                            .birth("1992-04-24")
                            .age(21)
                            .build();

        // When - 테스트 수행
        user1Mapper.insert(user1DTO);

        // Then - 테스트 결과를 검증
        User1DTO savedUser = user1Mapper.select(user1DTO.getUser_id());
        assertEquals(savedUser.getUser_id(), user1DTO.getUser_id());

    }

    @Order(2)
    @DisplayName("조회 테스트")
    @Test
    void select() {
        // Given
        String uid = "abc3533";

        // When
        User1DTO findUser = user1Mapper.select(userid);

        // Then
        System.out.println(findUser);
        assertEquals(findUser.getUser_id(), userid);

    }

    @Order(5)
    @DisplayName("전체 테스트")
    @Test
    void selectAll() {

        // Given


        // When
        List<User1DTO> dtoList = user1Mapper.selectAll();

        // Then
        System.out.println(dtoList);
        assertFalse(dtoList.isEmpty());

    }

    @Order(3)
    @DisplayName("수정 테스트")
    @Test
    void update() {
        // Given
        User1DTO user1DTO = User1DTO.builder()
                            .user_id(userid)
                            .name("김둘삼")
                            .birth("1992-10-12")
                            .age(25)
                            .build();

        // When
        user1Mapper.update(user1DTO);

        // Then
        User1DTO modifiedUser = user1Mapper.select(user1DTO.getUser_id());
        assertEquals(modifiedUser, user1DTO);
    }

    @Order(4)
    @DisplayName("삭제 테스트")
    @Test
    void delete() {

        // Given
        String  uid = "abc3533";

        // When
        user1Mapper.delete(userid);

        // Then
        User1DTO removeUser = user1Mapper.select(userid);
        assertNull(removeUser);
    }
}