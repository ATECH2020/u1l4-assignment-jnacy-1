import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int students1 = scanner.nextInt();
        int students2 = scanner.nextInt();
        int students3 = scanner.nextInt();
        int desks1, desks2, desks3, desksTotal;

        /*
         *  your code goes here
         */
        // The problem calls for ceil(students/2).
        // By default, division in Java floors non-integer values,
        // We can use this with
        // floor((n+1)/2) = ceil(n/2) for natural n.
        // Let n = students and the problem is solved.
        desks1 = (students1 + 1) / 2;
        desks2 = (students2 + 1) / 2;
        desks3 = (students3 + 1) / 2;

        desksTotal = desks1 + desks2 + desks3;

        System.out.print(desksTotal);

        // closing the scanner object
        scanner.close();
    }
}