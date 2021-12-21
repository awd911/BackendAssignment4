package com.example.getmesocialservice.Exception;

public class exception extends Exception{
    @Override
    public String getMessage(){
        return "Classified Information...";
    }

    public String notEmpty() {
        return "Variable cannot be empty";
    }

    public String userRoot() {
        return "Invalid Input: Name cannot be 'root'";
    }
}
