import javax.swing.*;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Task in Lesson 11 OOP
        /* Haus kv = new Haus();
        kv.name = "Apartment";
        kv.location = "Kok-Jar";
        kv.kabaty = 4;
        kv.komnatanynSany = 2;
        System.out.println(kv.name + kv.location + kv.kabaty + kv.komnatanynSany);*/
        //

       // LocalDate borth = LocalDate.of(1997,11,1);


      // Task for HW11 OOP
        /*Account highIncomeDay = new Account();
        highIncomeDay.daylyIncome = 10000;
        highIncomeDay.daylySpending = 245;

        System.out.println("Kirewe jakwy bolgon kunu 'balance' osuwu " + highIncomeDay.daylyIncome -
               - highIncomeDay.daylySpending);*/

        Scanner fromC = new Scanner(System.in);
        Seasons spring = new Seasons();
        spring.answer(fromC.nextInt());


    }}
