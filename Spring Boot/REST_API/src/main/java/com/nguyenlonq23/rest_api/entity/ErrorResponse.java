package com.nguyenlonq23.rest_api.entity;

public class ErrorResponse {
    public int status;
    public String message;
    public long timestamp;

    public ErrorResponse(int status, String message ) {
        this.status = status;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }
}
