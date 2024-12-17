package org.example;

import java.util.concurrent.CompletableFuture;

public class  CompletableFuturePractice{
    public static void main(String[] args) {
        // Start a task to clean the room
        CompletableFuture<Void> cleanRoom = CompletableFuture.runAsync(() -> {
            System.out.println("Cleaning the room...");
            try {
                Thread.sleep(2000); // Simulate time taken to clean the room
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Room is clean!");
        });

        // Do other things while the room is being cleaned
        System.out.println("Playing outside...");

        // Wait for the room to be cleaned before doing the next task
        cleanRoom.join();
        System.out.println("Now making a sandwich.");
    }
}