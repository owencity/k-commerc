package kdk.kdk_commerce.service;

import kdk.kdk_commerce.entity.UserEntity;
import kdk.kdk_commerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired private UserRepository userRepository;

    public List<UserEntity> getAllUsers(String query) {
        List<UserEntity> userEntities;

        if(query != null && !query.isBlank()) {
            // TODO : query 검색어 기반 , 해당 검색어가 username에 포함되어 있는 유저목록 가져오기
            userEntities = userRepository.findByUsernameContaining(query);
        }else {
            userEntities = userRepository.findAll();
        }

//        return userEntities.stream().map(
//                userEntity -> getUserWithFollowingStatus(userEntity, currentUser)).toList();
    }
}
