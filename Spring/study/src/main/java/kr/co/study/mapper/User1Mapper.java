package kr.co.study.mapper;

import kr.co.study.dto.User1DTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public class User1Mapper {

    public User1DTO selcet(String user_id) {
        return null;
    }
    public List<User1DTO> selcetAll() {
        return null;
    }
    public void insert(User1DTO dto) {

    }
    public void update(User1DTO dto) {

    }
    public void delete(String user_id) {

    }
}
