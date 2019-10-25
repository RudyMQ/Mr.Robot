/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.MonthDay;

/**
 *
 * @author Rudy MQ
 */
public class Age {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        int year = LocalDate.now().getYear();
        int mo = LocalDate.now().getMonthValue();
        int day = MonthDay.now().getDayOfMonth();

        System.out.println("Import the Year");
        int Year1 = in.nextInt();
        System.out.println("import the month");
        int month = in.nextInt();
        System.out.println("import the day");
        int day1 = in.nextInt();
        if (Year1 < year && month < 12 && month > 1 && day1 < 31 && day1 > 1) {

            int day12 = 30 - day1;
            int day123 = day12 + day;

            int yourage = year - Year1;
            System.out.println("your age is " + yourage);

            int yourage1 = (month - mo);

            if (yourage1 > 0) {

                System.out.println("your age is " + yourage1);

            } else {
                int posage = (yourage1 * -1) - 1;
                System.out.println("and " + posage + " months and " + day123 + " days");

                int in_months = posage + (yourage * 12);
                System.out.println("in months " + in_months);

                double days = 30.5 * in_months;
                System.out.println("in days " + days);
                double hours = days * 24;
                System.out.println("in hours " + hours);
                double minutes = hours * 60;
                System.out.println("in minutes " + minutes);
                double Seconds = minutes * 60;
                System.out.println("in Seconds " + Seconds);

            }

            System.out.println("end");
        } else {
            System.out.println("Error");
        }

    }
}










_______________________________________________________________________________
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.MonthDay;

/**
 *
 * @author Rudy MQ
 */
public class Age {

    static void findAge(int current_date, int current_month,
            int current_year, int birth_date,
            int birth_month, int birth_year) {
        Scanner in = new Scanner(System.in);
        int month[] = {31, 28, 31, 30, 31, 30, 31,
            31, 30, 31, 30, 31};

        if (birth_date > current_date) {
            current_month = current_month - 1;
            current_date = current_date + month[birth_month - 1];
        }

        if (birth_month > current_month) {
            current_year = current_year - 1;
            current_month = current_month + 12;
        }

        int calculated_date = current_date - birth_date;
        int calculated_month = current_month - birth_month;
        int calculated_year = current_year - birth_year;

        System.out.println("Present Age");
        System.out.println("Your Present Age is " + calculated_year
                + " And " + calculated_month + " Months and "
                + calculated_date + "days");
        int in_months = (calculated_year * 12)+4;
        System.out.println("in months " + in_months);
        double days = 30.551 * in_months;
        System.out.println("in days " + days);
        double hours = days * 24;
        System.out.println("in hours " + hours);
        double minutes = hours * 60;
        System.out.println("in minutes " + minutes);
        double Seconds = minutes * 60;
        System.out.println("in Seconds " + Seconds);

        System.out.println("end");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // present date 
        int current_date = MonthDay.now().getDayOfMonth();
        int current_month = LocalDate.now().getMonthValue();
        int current_year = LocalDate.now().getYear();

        // birth dd// mm// yyyy 
        System.out.println("Import the date like YYYY MM DD");
        int birth_year = in.nextInt();
        int birth_month = in.nextInt();
        int birth_date = in.nextInt();

        // function call to print age 
        findAge(current_date, current_month, current_year,
                birth_date, birth_month, birth_year);

    }
}

