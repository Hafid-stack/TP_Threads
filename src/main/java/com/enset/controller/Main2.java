package com.enset.controller;

import com.enset.domain.Sommeur;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {


        int[] array = new int[1000];
        // Initialize array with some values
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // for example 1 to 1000
        }

        int numberOfChunks = 5;
        int chunkSize = array.length / numberOfChunks;

        ExecutorService executor = Executors.newFixedThreadPool(numberOfChunks);
        ArrayList<Sommeur> tasks = new ArrayList<>();

        for (int i = 0; i < numberOfChunks; i++) {
            int start = i * chunkSize;
            int end = (i == numberOfChunks - 1) ? array.length : start + chunkSize;

            Sommeur sommeur = new Sommeur(array, start, end);
            tasks.add(sommeur);
            executor.submit(sommeur);
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        int totalSum = 0;
        for (Sommeur s : tasks) {
            totalSum += s.getSomme();
        }

        System.out.println("Total sum = " + totalSum);
    }
}



