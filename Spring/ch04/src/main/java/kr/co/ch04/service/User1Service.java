package kr.co.ch04.service;

import kr.co.ch04.dao.User1DAO;
import kr.co.ch04.dto.User1DTO;
import kr.co.ch04.mapper.User1Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class User1Service {

    private final User1Mapper mapper;
    private final User1DAO user1DAO;

    public List<User1DTO> getUsers() {
        // return mapper.selectAll();

        return user1DAO.selectAll();
    }

    public User1DTO getUser(String user_id) {
        // return mapper.select(user_id);

        return user1DAO.select(user_id);
    }

    public void save(User1DTO user1DTO) {
        // MyBatis 방법
        // mapper.insert(user1DTO);

        // Spring JDBC 방법
        user1DAO.insert(user1DTO);
    }

    public void update(User1DTO user1DTO) {
        // mapper.update(user1DTO);

        user1DAO.update(user1DTO);
    }
    public void remove(String user_id) {
        // mapper.delete(user_id);

        user1DAO.delete(user_id);
    }
}
