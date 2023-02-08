package tools;

import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Jeremiah Torralba
 */

public class Tools {
    public static void main(String[] args) {
        String choice = "";
        String invalid = "\nPlease enter 1, 2, 3, or 0\n";

        do {
        	System.out.println("--------Tools--------");
            System.out.println("1 Encrypt String ");
            System.out.println("2 Parking Garage ");
            System.out.println("3 Inventory Tracker ");
            System.out.println("----------------------");
            System.out.println("0 To Stop Application ");
            System.out.println("----------------------");
            @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);

        	choice = scan.next();

            switch(choice) {
            case "0":
            	System.out.println("Exited application.");
            	System.exit(0);
            	break;
            case "1":
                Scanner input = new Scanner(System.in);
                System.out.println("\nPlease enter a string: ");
                String s = input.nextLine();
                System.out.println(encrypttext(s) + "\n");
            	break;
            case "2":
                parkinggarage();
                System.out.println("");
                break;
            case "3":
                inventorytracker();
                break;
            default:
            	System.out.println(invalid);
            	break;
            }

        } while(!choice.matches("[0]"));
        System.out.println(invalid);
    }

    public static String encrypttext(String s){
        int i;
        char ch;
        String even="";
        String odd="";
        char scp='!', scp2='<', scp3='(', scp4='[', scp5='{', scs='\\', scexp='^', scm='-', sce='=', scd='$', scp6='!',
                scc='|', scp7=']', scp8='}', scp9=')', scq='?', sca='*', sca2='+', scp10='.', scp11='>', sct='~',
                sca3='@', scap='#', scp12='%', sca4='`', scc2=':', scc3=';', scq2='"', scq3='\'', scs2='/', scp13='.',
                scc4=',';
        boolean isEven=true;

        for (i=0;i<s.length();i++){
            ch = s.charAt(i);
            if (Character.isDigit(ch) || Character.isLetter(ch) || Character.isDefined(scp)
                    || Character.isDefined(scp2) || Character.isDefined(scp3)  || Character.isDefined(scp)
                    || Character.isDefined(scp5) || Character.isDefined(scs)  || Character.isDefined(scexp)
                    || Character.isDefined(scm) || Character.isDefined(sce)  || Character.isDefined(scd)
                    || Character.isDefined(scp6) || Character.isDefined(scc)  || Character.isDefined(scp7)
                    || Character.isDefined(scp8) || Character.isDefined(scp9) || Character.isDefined(scq)
                    || Character.isDefined(scp) || Character.isDefined(sca)  || Character.isDefined(sca2)
                    || Character.isDefined(scp10) || Character.isDefined(scp11)  || Character.isDefined(sct)
                    || Character.isDefined(sca3) || Character.isDefined(scap)  || Character.isDefined(scp12)
                    || Character.isDefined(sca4) || Character.isDefined(scc2) || Character.isDefined(scc3)
                    || Character.isDefined(scq2) || Character.isDefined(scq3) || Character.isDefined(scs2)
                    || Character.isDefined(scp13) || Character.isDefined(scc4)) {
            if (isEven)
               even+=ch;
            else
               odd+=ch;
            isEven=!isEven;
            }
         }
         return even+odd;
    }

    public static void parkinggarage() {
        double ratey = 2.00;
        double raten = 3.00;
        double more12 = 2.50;
        double chargehours = 12;
        double maxcharge = 100;
        double total = 100;

        @SuppressWarnings("resource")

        Scanner inputpg = new Scanner(System.in);
        float time = 0;
        do {
            try {
                System.out.print("\nEnter hours parked: ");
                time = inputpg.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid: Enter hours parked, must be 1 or more.");
            }
            inputpg.nextLine();
        } while (time <= 0);

        String answer = "";
        while (answer != null) {
            if (answer.matches(".*[y].*") || answer.matches(".*[n].*")
                    || answer.matches(".*[Y].*") || answer.matches(".*[N].*")) {
                break;
            }
            System.out.print("Is customer a member (y/n)? ");
            answer = inputpg.next();
        }

        if (answer.equals("y") || answer.equals("Y")) {
            System.out.printf("%nHourly Rate:       $  "+ "%.2f %n", ratey);
            System.out.println("Chargeable Hours:     "+ Math.round(time)*1.0000 /1.0000);
            total = ratey*Math.round(time);
        }
        else if (answer.equals("n") || answer.equals("N") && time<=chargehours) {
            System.out.printf("%nHourly Rate:       $  "+ "%.2f %n", raten);
            System.out.println("Chargeable Hours:     "+ Math.round(time)*1.0000 /1.0000);
            total = raten*Math.round(time);
        }
        else if (answer.equals("n") || answer.equals("N") && time>=chargehours) {
            System.out.printf("%nHourly Rate:       $  "+ "%.2f %n", more12);
            System.out.println("Chargeable Hours:     "+ Math.round(time)*1.0000 /1.0000);
            total = more12*Math.round(time);
        }
        if (total<=100) {
            System.out.printf("Total Charges:     $  "+ "%.2f %n",+ total);
        }
        else if (total>=100) {
            System.out.printf("Total Charges:     $  "+ "%.2f %n",+ maxcharge);
        }
        else {}
    }

    public static void inventorytracker() {

        /** Inventory program */
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        /** Default inventory object */
        Inventory inventory = new Inventory();

        /** Enter value for data member id */
        String id = "";
        while (id != null) {
            System.out.print("Enter Inventory Item ID: ");
            id = input.nextLine();
            if (!id.matches(".*[A-Za-z].*" + "-" + "[0-9]{4}+")) {
                System.out.println("\nInvalid: Inventory ID must be in the form ABC-1234\n");
            } else if (id.matches(".*[A-Za-z].*" + "-" + "[0-9]{4}+")) {
                break;
            }
        }

        /** Enter value for data member name */
        String name = "";
        while (name != null) {
            System.out.print("Enter Item Name: ");
            name = input.nextLine();
            if (name.isEmpty()) {
                System.out.println("\nInvalid: you must enter an item name.\n");
            }
            if (name.matches(".*[A-Za-z].*")) {
                break;
            }
        }

        /** Enter value for data member qoh */
        int qoh = 0;
        do {
         try {
            System.out.print("Qty On Hand: ");
            qoh = input.nextInt();
         } catch (InputMismatchException e) {
            System.out.println("\nInvalid: QOH must be 0 or more.\n");
         }
         input.nextLine(); // clears the buffer
        } while (qoh <= 0);

        /** Enter value for data member rop */
        int rop = 0;
        do {
            try {
                System.out.print("Re-Order Point: ");
                rop = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid: ROP must be greater than 0.\n");
            }
            input.nextLine();
        } while (rop <= 0);

        /** Enter value for data member sellPrice */
        double sellPrice = 0;
        do {
            try {
                System.out.print("Selling Price: ");
                sellPrice = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid: Selling price, must be greater than 0.\n");
            }
            input.nextLine();
        } while (sellPrice <= 0);

            /** Calling mutator methods */
            inventory.setId(id);
            inventory.setName(name);
            inventory.setQoh(qoh);
            inventory.setRop(rop);
            inventory.setSellPrice(sellPrice);

            /** Program output */
            System.out.println("\n" + inventory.toString());

            /** Check if item needs to be re-ordered */
            if (qoh <= rop) {
                System.out.println("\nYou need to order more " + name);
            } else {
            }

            /** Ask user for number of units to buy */
            int units = 0;
            double hst = 0;
            do {
                try {
                    System.out.print("\nEnter # of units to buy: ");
                    units = input.nextInt();
                    hst = units * sellPrice * 1.13;

                } catch (InputMismatchException e) {
                    System.out.print("\nInvalid: Enter # of units to buy, must be greater than 0. \n");
                } catch (IllegalFormatConversionException ce) {
                    System.out.print("\nInvalid: Enter # of units to buy, must be greater than 0. \n");
                }
                input.nextLine();
            } while (units <= 0);
        if (units > 0) {
            System.out.println(String.format("\nTotal Cost: " + "$" + "%.2f", hst) + "\n");
        } else if (units <= 0) {
            System.out.println("\nTotal Cost: $0.00\n");
        }
    }
}