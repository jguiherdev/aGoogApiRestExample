package com.codingjava.codingjava.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path="/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path="/add")
    public ResponseEntity<Userr> addNewUser (@RequestBody Userr user) {
        userService.saveUser(user);
        return new ResponseEntity<Userr>(user, HttpStatus.CREATED);
    }

    @RequestMapping(path="/{id}")
    public ResponseEntity <Userr> getUser(@PathVariable("id") String id) {
        return new ResponseEntity<Userr>(userService.getUser(id), HttpStatus.OK);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Userr> getAllUsers() {
        return userService.getAllUsers();
    }

    
    @PostMapping(path="/save")
    public ResponseEntity<Iterable<Userr>> addNewUserAndReturnAll (@RequestBody Userr user) {
        userService.saveUser(user);
        return new ResponseEntity<Iterable<Userr>>(userService.getAllUsers(), HttpStatus.CREATED);
    }

    
    
}
