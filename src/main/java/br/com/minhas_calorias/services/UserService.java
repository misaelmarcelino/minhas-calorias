package br.com.minhas_calorias.services;

import br.com.minhas_calorias.model.User;
import br.com.minhas_calorias.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }


    public User findUserById(Long id) {
        Optional<User>UserOptional = userRepository.findById(id);
        if (UserOptional.isPresent()) {
            return UserOptional.get();
        } else {
            throw new RuntimeException("User not found");
        }
    }
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
    public void deleteUser(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            userRepository.delete(userOptional.get());
        } else {
            throw new RuntimeException("User not found");
        }
    }
    public User updateUser(User user) {
        Optional<User> userOptional = userRepository.findById(user.getId());
        if (userOptional.isPresent()) {
            return userRepository.save(user);
        } else {
            throw new RuntimeException("User not found");
        }
    }
}
