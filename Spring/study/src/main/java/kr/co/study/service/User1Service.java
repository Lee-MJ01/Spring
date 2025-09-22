package kr.co.study.service;

import kr.co.study.dto.User1DTO;
import kr.co.study.mapper.User1Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class User1Service {

    private final User1Mapper user1Mapper;

    public List<User1DTO> selectAll() {
        return user1Mapper.selectAll();
    }

    public User1DTO select(String userid) {
        return user1Mapper.select(userid);
    }

    public void insert(User1DTO user1DTO) {
        user1Mapper.insert(user1DTO);
    }

    public void update(User1DTO user1DTO) {
        user1Mapper.update(user1DTO);
    }

    public void delete(String userid) {
        user1Mapper.delete(userid);
    }
}
