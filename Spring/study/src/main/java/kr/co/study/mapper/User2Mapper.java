package kr.co.study.mapper;

import kr.co.study.dto.User1DTO;
import kr.co.study.dto.User2DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface User2Mapper {

    public User2DTO getUserById(String userid);
    public List<User2DTO> getAllUsers();
    public void insert();
    public void update();
    public void delete();

}
