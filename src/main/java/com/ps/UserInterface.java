package com.ps;

import java.util.Scanner;

public class UserInterface {

    static Scanner commandScan = new Scanner(System.in);
    private static Dealership dealership; // Declaration, still need to initialize (name, address, phone)

    private static void init(){ // private, since we don't want to access this method in any other class
        // Loading the dealership from a file
        DealershipFileManager.getDealership();
    }

    public static void display() {
        init();
        // Load the menu
        int mainMenuCommand;
        do {
            System.out.println("""
                    Make a selection:
                    SEARCH BY:
                    (1) Price Range
                    (2) Make/Model
                    (3) Year
                    (4) Color
                    (5) Mileage
                    (6) Vehicle Type
                    
                    OTHER OPTIONS:
                    (7) Display All Vehicles
                    (8) Add a Vehicle
                    (9) Remove a Vehicle
                    
                    (0) Exit
                    """);
            System.out.print("Your selection: ");
            mainMenuCommand = commandScan.nextInt();

            switch (mainMenuCommand) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;

                default:
                    System.out.println("Invalid input, try again.");
            }
        } while (mainMenuCommand != 0);
    }

    public static void processGetByPriceRequest() {

    }
    public static void processGetByMakeModelRequest() {

    }
    public static void processGetByYearRequest() {

    }
    public static void processGetByColorRequest() {

    }
    public static void processGetByMileageRequest() {

    }
    public static void processGetByVehicleTypeRequest() {

    }
    public static void processGetAllVehiclesRequest() {

    }
    public static void processAddVehicleRequest() {

    }
    public static void processRemoveVehicleRequest() {

    }
}