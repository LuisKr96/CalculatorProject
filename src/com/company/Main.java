package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        {
            String PaintName = "PaintAHouse";
            int squareMeterCoveredWithOneLitre = 9;
            int paintBucketCost = 7;



            Scanner input = new Scanner(System.in);
            int wallLength;
            int wallHeight;
            System.out.println("Enter wall length:");
            wallLength = input.nextInt();

            System.out.println("Enter wall height:");
            wallHeight = input.nextInt();

            int surfaceAreaOfOneWall = wallHeight * wallLength;
            int totalArea = surfaceAreaOfOneWall * 4;

            double bucketsNeeded = (double) totalArea / paintBucketCost;
            int myInt = (int) Math.ceil(bucketsNeeded);



            if ((bucketsNeeded * paintBucketCost) <= totalArea) {
                System.out.println("Buckets needed " + myInt++);
            }



            double totalCost = paintBucketCost * bucketsNeeded;

            System.out.println("Cost of painting entire walls £" + totalCost);


            double ceilingArea = wallLength * wallLength;
            double bucketsForCeiling = ceilingArea / paintBucketCost;

            double costOfCeiling = bucketsForCeiling * paintBucketCost;

            System.out.println("Cost of ceiling £" + costOfCeiling);

            double hoursToPaintOneWall = 2.3;
            double hourRateForPainterInPounds = 20.8d;


            double timeToCompleteWallPainting = hoursToPaintOneWall * 4;


            double totalRateForCompletion = timeToCompleteWallPainting * hourRateForPainterInPounds;
            System.out.println("Total cost for painter £" + totalRateForCompletion);

            String hireOrNoHire = (totalRateForCompletion <= 150) ? "Hire painter" : "Don't hire painter";
            System.out.println(hireOrNoHire);

            int dailyRateByMicrosoftPaint = 140;

            if(dailyRateByMicrosoftPaint <= totalRateForCompletion){
                System.out.println("Hire Microsoft Paint");
            } else
            {
                System.out.println("Hire painter by hourly rate");
            }

            Scanner rate = new Scanner(System.in);
            int dayOfWeek;

            System.out.println("Enter day of week:");
            dayOfWeek = input.nextInt();


            switch(dayOfWeek){
                case 1,2,3,4,5:
                    System.out.println("Normal rate");
                break;
                case 6,7:
                    System.out.println("Weekend rate");
                break;
            }


        }


    }

}



