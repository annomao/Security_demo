package ke.co.safaricom.Security_demo.controllers;

import ke.co.safaricom.Security_demo.dtos.UserCreateRequest;
import ke.co.safaricom.Security_demo.entities.User;
import ke.co.safaricom.Security_demo.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/users/get/{id}")
    public ResponseEntity<User> getOneUser(@PathVariable long id){
        return ResponseEntity.of(userService.getUser(id));
    }

    @PostMapping("users/create/")
    public ResponseEntity<User> createUser(@RequestBody UserCreateRequest userCreateRequest){
        return ResponseEntity.ok(userService.createUser(userCreateRequest));
    }
}
