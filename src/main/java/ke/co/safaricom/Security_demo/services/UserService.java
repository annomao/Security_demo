package ke.co.safaricom.Security_demo.services;

import ke.co.safaricom.Security_demo.dtos.UserCreateRequest;
import ke.co.safaricom.Security_demo.entities.User;
import ke.co.safaricom.Security_demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(UserCreateRequest user){
        User user1 = new User();
        user1.setUsername(user.getUsername());
        user1.setEmail(user.getEmail());
        user1.setPassword(user.getPassword());
        userRepository.save(user1);
        return user1;
    }

    public Optional<User> getUser(long id){
        return userRepository.findById(id);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
