package com.library.lombok;

/**
 *
 * Lombok allows us to create immutable objects using the @Value annotation:
 * Class records will be the natural way for these use-cases
 *
 */

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Value;

@Value
@Getter(AccessLevel.NONE)
public class ImmuableObjectLombokAccessLevel {

    public ImmuableObjectLombokAccessLevel(){
        this.red = 115;
        this.green = 115;
        this.blue = 115;
    };

    int red;
    int green;
    int blue;

    public String getHexString() {
        return String.format("#%02X%02X%02X", red, green, blue);
    }
}
