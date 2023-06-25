package com.lessons.stream;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Service {

    private String name;
    private String method;

}
