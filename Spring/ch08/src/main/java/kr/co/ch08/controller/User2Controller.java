package kr.co.ch08.controller;

import kr.co.ch08.dto.User2DTO;
import kr.co.ch08.service.User2Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class User2Controller {
    private final User2Service user2Service;

    @GetMapping("/user2")
    public ResponseEntity<List<User2DTO>> list(){
        List<User2DTO> dtoList = user2Service.findAll();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dtoList);
    }

    @GetMapping("/user2/{userid}")
    public ResponseEntity<User2DTO> user2(@PathVariable("userid") String userid){
        User2DTO dto = user2Service.findById(userid);

        return ResponseEntity
                .status(HttpStatus.FOUND)
                .body(dto);
    }

    @PostMapping("/user2")
    public ResponseEntity<User2DTO> insert(@RequestBody User2DTO user2DTO){
        log.info("User2DTO: {}", user2DTO);
        User2DTO dto = user2Service.save(user2DTO);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dto);
    }

    @PutMapping("/user2")
    public ResponseEntity<User2DTO> update(@RequestBody User2DTO user2DTO){
        User2DTO dto = user2Service.modify(user2DTO);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dto);
    }

    @DeleteMapping("/user2/{userid}")
    public ResponseEntity<Boolean> delete(@PathVariable("userid") String userid){
        log.info("user1 ==> userid={}", userid);
        boolean isSuccess = user2Service.remove(userid);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(isSuccess);
    }
}
