package com.ch.axa.its;

import java.util.List;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuizManager quizManager = new QuizManager();

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Choose a category (population, area_km2, founded): ");
        String category = scanner.nextLine();

        if (userName.isEmpty() || category.isEmpty()) {
            System.out.println("Please enter both your name and a valid category.");
            return;
        }

        List<String> quizItems = quizManager.generateQuizItems(category);
        if (quizItems.isEmpty()) {
            System.out.println("No towns found with the selected category.");
            return;
        }

        int score = 0;

        // Spiel starten (5 Durchläufe)
        for (int i = 0; i < 5; i++) {
            System.out.println("\nQuestion " + (i + 1));

            // Frage anzeigen
            System.out.println("Which city has the highest " + category + "?");
            System.out.println("1. " + quizItems.get(0));
            System.out.println("2. " + quizItems.get(1));
            System.out.println("3. " + quizItems.get(2));

            // Benutzerantwort einholen
            System.out.print("Enter the number of your answer (1, 2, 3): ");
            int userAnswer = scanner.nextInt();
            scanner.nextLine();  // Den Eingabepuffer leeren

            // Antwort überprüfen (richtige Antwort ist immer der erste Eintrag in der Liste)
            String correctAnswer = quizItems.get(0);
            if (quizItems.get(userAnswer - 1).equals(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + correctAnswer);
            }
        }

        // Endergebnis anzeigen
        System.out.println("\nQuiz finished!");
        System.out.println("You scored " + score + " out of 5.");
        System.out.println("Thank you for playing, " + userName + "!");

        quizManager.close();
    }
}
