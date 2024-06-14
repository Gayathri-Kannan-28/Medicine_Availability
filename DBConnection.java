package com.example.demo8;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class DBConnection{
    public static MongoClient connector()
    {
        try
        {
            MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
            return mongoClient;

        }
        catch(Exception e)
        {
            return null;
        }
    }
}