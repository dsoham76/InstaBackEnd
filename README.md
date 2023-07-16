# InstaBackEnd

## Framework and Language

> Framework: SpringBoot Language: Java 8

## Data flow

1.  Controller

        1.1  User Controller
                - @PostMapping("user/signup"): To sign up a user
                - @PostMapping("user/signIn"): To sign in a user
                - @DeleteMapping("user/signOut"): To sign out a user

        1.2  Post Controller
                - @PostMapping("post"): To upload a post
                - @DeleteMapping("post"): To delete a post

2.  Services

        1.1 UserService
                - signUpUser(User user)
                - signInUser(SignInInput signInInput)
                - sigOutUser(String email)

        1.2 Post Service
                - createInstaPost(Post post, String email)
                - removeInstaPost(Integer postId,String email)

        1.3 Authentication Service
                - authenticate(String email, String authTokenValue)
                - saveAuthToken(AuthenticationToken authToken)
                - findFirstByUser(User user)
                - removeToken(AuthenticationToken token)

3.  Repository

        1.1 User Repo
        1.2 Autentication Repo
        1.3 Post Repo

4.  Database Design

        4.1 User Model:
                - Integer userId;
                - String userEmail;
                - String userPassword;
                - String firstName;
                - String lastName;
                - Integer age;
                - String email;
                - String phoneNumber;
        4.2 Post Model:
                - Integer PostId;
                - String postData;
                - LocalDateTime postCreatedTimeStamp;
                - private User postOwner;
        4.3 Authentication Model:
                - Long tokenId;
                - String tokenValue;
                - LocalDateTime tokenCreationDateTime;
                - User user;

## Data Structure Used in Project

     JPARepository has been used as primay datastructure

## Project Summary

    The InstaBackEnd API  is a comprehensive software solution designed to keep track of orders . The system provides a centralized platform that enables  user to create, read, edit, and delete post.
