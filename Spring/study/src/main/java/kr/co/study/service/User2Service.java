package kr.co.study.service;

import kr.co.study.dto.User2DTO;
import kr.co.study.mapper.User2Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class User2Service {

    private final User2Mapper user2Mapper;

    public List<User2DTO> getAllUsers() {
        return user2Mapper.getAllUsers();
    }
}
