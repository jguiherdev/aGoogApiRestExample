package com.codingjava.codingjava.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired UserRepository userRepository;

    public void saveUser(Userr user) {
        userRepository.save(user);
    }

    public Userr getUser(String id) {
        return userRepository.findById(Long.valueOf(id)).get();
    }

    public Iterable<Userr> getAllUsers() {
        return userRepository.findAll();
    }
    

    
}
