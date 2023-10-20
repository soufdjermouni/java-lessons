package com.feature.json;

import com.google.gson.Gson;

public class DemoGson {

    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = "{\"brand\":\"Jeep\", \"doors\": 3}";
        Voiture car = gson.fromJson(json, Voiture.class);
        System.out.println(car); //Voiture(brand=Jeep, doors=3)

        VoitureRecord carRecord = gson.fromJson(json, VoitureRecord.class);
        System.out.println(carRecord);//VoitureRecord[brand=Jeep, doors=3]


        Voiture carNew = new Voiture();
        carNew.brand = "Rover";
        carNew.doors = 5;

        String jsonGet = gson.toJson(carNew);
        System.out.println(jsonGet);//{"brand":"Rover","doors":5}

    }
}
