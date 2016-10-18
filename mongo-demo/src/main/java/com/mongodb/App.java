package com.mongodb;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.Helper.printJson;

public class App {

    public static void main(String[] args) {
        MongoClient client = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        MongoDatabase db = client.getDatabase("riskdb");
        MongoCollection<Document> persons = db.getCollection("persons");
        Document bob = new Document("name", "Bob")
                .append("age", 30)
                .append("profession" , "programmer");
        Document alice = new Document("name", "Alice")
                .append("age", 23)
                .append("profession", "teacher");
        List<Document> personsList = new ArrayList<Document>();
        personsList.add(bob);
        personsList.add(alice);

        printJson(bob);
        printJson(bob);
//        persons.insertOne(bob);
//        persons.insertOne(alice);







    }
}
