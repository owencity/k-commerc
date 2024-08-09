package kdk.kdk_commerce.model;

import kdk.kdk_commerce.entity.UserEntity;

import java.time.ZonedDateTime;

public record User (
        Long userId,
        String username,
        ZonedDateTime createdDateTime,
        ZonedDateTime updatedDateTime,
) {
    public static User from(UserEntity userEntity) {
        return new User(
                userEntity.getUserId(),
                userEntity.getUsername(),
                userEntity.getCreatedDateTime(),
                userEntity.getUpdatedDateTime()
                );
    }
}
