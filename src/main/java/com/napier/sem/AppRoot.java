package com.napier.sem;

public class AppRoot {

    public static void main(String[] args){

        System.out.println("Hello TRAVIS");
        MongoIntergration mongo = new MongoIntergration();

        mongo.getMongoConnection();
    }
}
