package application.service;


import application.DTO.ResponseDto;
import application.model.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}