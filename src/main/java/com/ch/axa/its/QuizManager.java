package com.ch.axa.its;

import com.mongodb.client.*;
import org.bson.Document;

import java.util.*;

public class QuizManager {
    private MongoClient mongoClient;
    private MongoDatabase db;
    private MongoCollection<Document> towns;

    public QuizManager() {
        mongoClient = MongoClients.create("mongodb://root:1234@localhost");
        db = mongoClient.getDatabase("town-quiz-db");
        towns = db.getCollection("towns");
    }

    public List<String> generateQuizItems(String category) {
        List<Document> result = towns.aggregate(Arrays.asList(
                new Document("$match", new Document(category, new Document("$ne", null))), // Filter: Kategorie darf nicht null sein
                new Document("$sort", new Document(category, -1)), // Sortieren nach der Kategorie in absteigender Reihenfolge
                new Document("$limit", 3) // Nur die ersten drei Städte auswählen
        )).into(new ArrayList<>());

        // Extrahiere die Stadtnamen aus den Ergebnissen
        List<String> quizOptions = new ArrayList<>();
        for (Document town : result) {
            quizOptions.add(town.getString("name"));
        }

        // Mische die Reihenfolge der Städte zufällig
        Collections.shuffle(quizOptions);
        return quizOptions;
    }

    public void close() {
        mongoClient.close();
    }
}
