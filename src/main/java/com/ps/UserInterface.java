package com.ps;

public class UserInterface {

    private static Dealership dealership; // Declaration, still need to initialize (name, address, phone)

    private static void init(){ // private, since we don't want to access this method in any other class
        // Loading the dealership from a file
        DealershipFileManager.getDealership();
    }

    public static void display() {
        init();
        // Load the menu
    }
}