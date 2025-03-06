package com.githubproject;
import java.util.Random;
public class RandomCode {
    public static void main(String[] args) {
        int x = new Random().nextInt(10);
        System.out.println("Your random number is: " + x);
    }
}