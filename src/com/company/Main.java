package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        {
            String PaintName = "PaintAHouse";


            Scanner input = new Scanner(System.in);
            int wallLength;
            int wallHeight;
            System.out.println("Enter wall length:");
            wallLength = input.nextInt();

            System.out.println("Enter wall height:");
            wallHeight = input.nextInt();

            int surfaceAreaOfOneWall = wallHeight * wallLength;
            double hoursToPaintOneWall =surfaceAreaOfOneWall / 40;

            int totalArea = surfaceAreaOfOneWall * 4;
            int paintBucketCost = 7;
            double bucketsNeeded = (double) totalArea / paintBucketCost;
            int myInt = (int) Math.ceil(bucketsNeeded);


            double hoursToPaintEveryWall = hoursToPaintOneWall * 4;

            double rateToPaintEveryWall = 20.8d * hoursToPaintEveryWall;

            System.out.println("Total cost for painter £" + rateToPaintEveryWall);

            if ((bucketsNeeded * paintBucketCost) <= totalArea) {
                System.out.println("Buckets needed " + myInt++);
            }



            double totalCost = paintBucketCost * bucketsNeeded;

            System.out.println("Cost of painting entire walls £" + totalCost);


            double ceilingArea = wallLength * wallLength;

            double bucketsForCeiling = ceilingArea / paintBucketCost;

            double costOfCeiling = bucketsForCeiling * paintBucketCost;

            System.out.println("Cost of ceiling £" + costOfCeiling);



            String hireOrNoHire = (rateToPaintEveryWall <= 150) ? "Hire painter" : "Don't hire painter";
            System.out.println(hireOrNoHire);

            int dailyRateByMicrosoftPaint = 140;

            if(dailyRateByMicrosoftPaint <= rateToPaintEveryWall){
                System.out.println("Hire Microsoft Paint");
            } else
            {
                System.out.println("Hire painter by hourly rate");
            }

            Scanner rate = new Scanner(System.in);
            int dayOfWeek;

            System.out.println("Enter day of week:");
            dayOfWeek = rate.nextInt();


            switch(dayOfWeek){
                case 1,2,3,4,5:
                    System.out.println("Normal rate");
                break;
                case 6,7:
                    System.out.println("Weekend rate");
                break;
                default:
                    System.out.println("Not available");
            }

            do {
                System.out.println("You are not getting charged an additional rate");
                dayOfWeek++;
            }
            while(dayOfWeek <= 5);

            Scanner time = new Scanner(System.in);
            int timeAvailable;

            System.out.println("Enter time (24hrs) to check availability:");
            timeAvailable = time.nextInt();

            if(timeAvailable < 9 || timeAvailable > 17){
                System.out.println("Not available");
            } else {
                System.out.println("Available");
            };

            for(timeAvailable = 9; timeAvailable <= 17; timeAvailable++){
                System.out.println("Available: " + timeAvailable + ":00");
            }

            System.out.println("What colour paint would you like?");

            String[] colourPaint = {"White", "Grey", "Blue", "Red", "Green"};
            for (int colour = 0; colour < colourPaint.length; colour++){
                System.out.println(colourPaint[colour]);
            }

            String colourChosen = time.next();
            if(colourChosen.contains("White")){
                System.out.println("Low stock");
            } else if (colourChosen.contains("Grey")){
                System.out.println("Colour is available");
            } else if (colourChosen.contains("Blue")){
                System.out.println("No stock left");
            } else if (colourChosen.contains("Red")){
                System.out.println("Colour is available");
            } else if (colourChosen.contains("Green")){
                System.out.println("Colour is available");
            } else{
                System.out.println("ERROR");
            }




        }


    }

}



