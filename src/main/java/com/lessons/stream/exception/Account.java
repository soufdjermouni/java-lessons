package com.lessons.stream.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.io.IOException;

@AllArgsConstructor
@Builder
public class Account {

    private boolean active;
    private String number;

    boolean isActive() throws IOException {
        return active;
    }
    String getNumber() throws IOException {
        return number;
    }
}
