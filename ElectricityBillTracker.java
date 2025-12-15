import java.util.Scanner;

public class ElectricityBillTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] bill = new double[12];
        double total = 0;
        double maxBill = 0;
        int month = 0;

        System.out.println(" ");
        System.out.println("   MONTHLY ELECTRICITY BILL TRACKER   ");
        System.out.println(" ");

        // Input monthly bills
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter electricity bill for month " + (i + 1) + ": ");
            bill[i] = sc.nextDouble();
            total += bill[i];

            if (bill[i] > maxBill) {
                maxBill = bill[i];
                month = i + 1;
            }
        }

        // Display bills
        System.out.println("\nElectricity Bills for the Year:");
        for (int i = 0; i < 12; i++) {
            System.out.println("Month " + (i + 1) + ": " + bill[i]);
        }

        double average = total / 12;

        // Results
        System.out.println("\nTotal Electricity Bill (Year): " + total);
        System.out.println("Average Monthly Bill: " + average);
        System.out.println("Highest Bill in Month " + month + ": s" + maxBill);
    }
}

/*
OUTPUT:

   MONTHLY ELECTRICITY BILL TRACKER   

Enter electricity bill for month 1: 1250
Enter electricity bill for month 2: 3021
Enter electricity bill for month 3: 2100
Enter electricity bill for month 4: 1256
Enter electricity bill for month 5: 3420
Enter electricity bill for month 6: 3651
Enter electricity bill for month 7: 2541
Enter electricity bill for month 8: 1562
Enter electricity bill for month 9: 2014
Enter electricity bill for month 10: 2022
Enter electricity bill for month 11: 2056
Enter electricity bill for month 12: 2077

Electricity Bills for the Year:
Month 1: 1250.0
Month 2: 3021.0
Month 3: 2100.0
Month 4: 1256.0
Month 5: 3420.0
Month 6: 3651.0
Month 7: 2541.0
Month 8: 1562.0
Month 9: 2014.0
Month 10: 2022.0
Month 11: 2056.0
Month 12: 2077.0

Total Electricity Bill (Year): 26970.0
Average Monthly Bill: 2247.5
Highest Bill in Month 6: 3651.0
*/