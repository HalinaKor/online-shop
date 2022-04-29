package flower.shop.online.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import flower.shop.online.model.User;
import flower.shop.online.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
