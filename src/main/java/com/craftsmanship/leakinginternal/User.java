package com.craftsmanship.leakinginternal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String username;
    private String password;

    @JsonIgnore  //permet d'eviter le Leaking Internals
    public String getPassword() {
        return password;
    }
}
