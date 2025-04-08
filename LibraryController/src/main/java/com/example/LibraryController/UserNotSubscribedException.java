package com.example.LibraryController;

public class UserNotSubscribedException extends RuntimeException{
    public UserNotSubscribedException(String message){
        super(message);
    }
}
