import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        
        int hourDiff, minDiff, secDiff;
        int timeDiff;

        /*
         *  your code goes here
         */
        hourDiff = hours2 - hours1;
        minDiff = minutes2 - minutes1;
        secDiff = seconds2 - seconds1;

        timeDiff = (hourDiff * 3600) + (minDiff * 60) + secDiff;

        System.out.print(timeDiff);

        // closing the scanner object
        scanner.close();
    }
}