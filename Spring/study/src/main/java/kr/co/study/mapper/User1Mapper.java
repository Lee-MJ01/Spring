package kr.co.study.mapper;

import kr.co.study.dto.User1DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface User1Mapper {

    public User1DTO select(String userid);
    public List<User1DTO> selectAll();
    public void insert(User1DTO dto);
    public void update(User1DTO user1DTO);
    public void delete(String userid);

}
