package kdk.kdk_commerce.repository;

import kdk.kdk_commerce.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findAll(UserEntity user);

    List<UserEntity> findByUsernameContaining(String query);
//    Optional<UserEntity> findByUsername(String username)
//    List<UserEntity> findByUsernameContaining(String username)
}
