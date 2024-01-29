package com.example.ProyectoSpring.exception;

public class TasksException extends Exception{
    private ErrorCodes errorCodes;
    public TasksException(ErrorCodes errorCodes, String message){
        super(message);
        this.errorCodes=errorCodes;
    }
    public String getMessageError(){
        return errorCodes + ": " + getMessage();
    }

}
