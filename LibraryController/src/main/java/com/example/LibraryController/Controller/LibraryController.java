package com.example.LibraryController.Controller;

import com.example.LibraryController.Model.Issue;
import com.example.LibraryController.Model.User;
import com.example.LibraryController.Repository.IssueRepository;
import com.example.LibraryController.Repository.UserRepository;
import com.example.LibraryController.UserNotSubscribedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class LibraryController {

    @Autowired
    UserRepository userrepo;

    @Autowired
    IssueRepository issuerepo;

    @PostMapping("/create-user")
    public ResponseEntity<User> create(@RequestBody User user) {
        return new ResponseEntity(userrepo.save(user), HttpStatus.OK);

    }

    @PostMapping("/issue-book")
    public ResponseEntity<Issue> issue(@RequestBody Issue is) {
        User hu = is.getUser();
        if (!hu.isSubscribed()) {
            throw new UserNotSubscribedException("illa");
        }
        return new ResponseEntity<>(issuerepo.save(is),HttpStatus.CREATED);


    }

    @GetMapping("/renew-user-sub/{id}")
    public ResponseEntity<User> eno(@PathVariable  Long id){
        if(userrepo.existsById(id)){
            if(userrepo.findById(id).isPresent()){
                User u=userrepo.findById(id).get();
                u.setSubscribed(true);
                userrepo.save(u);
            }

        }
        return new ResponseEntity(userrepo.findById(id).get(),HttpStatus.OK);
    }
}

