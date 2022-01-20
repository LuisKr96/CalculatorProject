package com.company;

public class Main {
    public static void main(String[] args) {

        {
            String PaintName = "PaintAHouse";
            int squareMeterCoveredWithOneLitre = 9;
            int paintBucketCost = 7;

            int wallLength = 20;
            int wallHeight = 8;
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
            double hourRateForPainterInPounds = 15.9d;


            double timeToCompleteWallPainting = hoursToPaintOneWall * 4;


            double totalRateForCompletion = timeToCompleteWallPainting * hourRateForPainterInPounds;
            System.out.println("Total rate " + totalRateForCompletion);


        }


    }

}



