package com.geekster.InstaBackend.controller;

import com.geekster.InstaBackend.model.Post;
import com.geekster.InstaBackend.service.AuthenticationService;
import com.geekster.InstaBackend.service.PostService;
import com.geekster.InstaBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    @Autowired
    PostService postService;

    @Autowired
    UserService userService;

    @Autowired
    AuthenticationService authenticationService;

    @PostMapping("post")
    public String createInstaPost(@RequestBody Post post, @RequestParam String email, @RequestParam String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return userService.createInstaPost(post,email);
        }
        else {
            return "Not an Authenticated user activity!!!";
        }
    }

    @DeleteMapping("post")
    public String removeInstaPost(@RequestParam Integer postId, @RequestParam String email, @RequestParam String token)
    {
        if(authenticationService.authenticate(email,token)) {
            return userService.removeInstaPost(postId,email);
        }
        else {
            return "Not an Authenticated user activity!!!";
        }
    }
}
