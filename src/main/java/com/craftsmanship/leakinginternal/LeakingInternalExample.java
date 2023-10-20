package com.craftsmanship.leakinginternal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LeakingInternalExample {
    public static void main(String[] args) throws Exception {

        User user = new User();
        user.setUsername("john");
        user.setPassword("secret");

        ObjectMapper objectMapper = new ObjectMapper();
        String json = null;
        try {
            json = objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            throw new Exception(e);
        }

        System.out.println(json); // Le champ "password" ne sera pas inclus dans la sortie JSON
    }
}
