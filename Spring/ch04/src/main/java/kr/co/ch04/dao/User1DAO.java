package kr.co.ch04.dao;

import kr.co.ch04.dto.User1DTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

// @Component를 해도 가능 => DAO 클래스 객체를 생성해서 컨테이너에 넣어주는 역할
// @Controller, @Service, @Repository => @Component에서 파생된 어노테이션. 의미 부여를 명확하게 하기 위해 세분화
@Repository
@RequiredArgsConstructor // 안전한 의존성 주입 방법(final)
public class User1DAO {

    // Spring JDBC 객체
    private final JdbcTemplate jdbcTemplate;

    public void insert(User1DTO user1DTO){
        String sql = "insert into tb_user1 values (?,?,?,?)";

        Object[] params = {
            user1DTO.getUser_id(),
            user1DTO.getName(),
            user1DTO.getBirth(),
            user1DTO.getAge()
        };

        jdbcTemplate.update(sql, params); // executeUpdate() 실행
    }

    public User1DTO select(String User_id){
        String sql = "select * from tb_user1 where User_id=?";

        // 단건 select문 처리 문법
        return jdbcTemplate.queryForObject(sql, new User1RowMapper(), User_id);
    }

    public List<User1DTO> selectAll(){
        String sql = "select * from tb_user1";

        // 다건 select문 처리 문법
        return jdbcTemplate.query(sql, new User1RowMapper());
    }

    public void update(User1DTO user1DTO){
        String sql = "update tb_user1 set name=?, birth=?, age=? where user_id=?";

        Object[] params = {
                user1DTO.getName(),
                user1DTO.getBirth(),
                user1DTO.getAge(),
                user1DTO.getUser_id()
        };
        jdbcTemplate.update(sql, params);
    }

    public void delete(String user_id){
        String sql = "delete from tb_user1 where user_id=?";

        jdbcTemplate.update(sql, user_id);
    }

}
