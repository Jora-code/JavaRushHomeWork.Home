package com.javarush.test.level05.lesson12.bonus01;

//import javafx.util.converter.IntegerStringConverter;

import java.io.*;
//import java.util.Scanner;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.
*/

public class Solution
{
   public static void main(String[] args) throws Exception
    {
     /*   Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int a = scanner.nextInt();
        int b = scanner.nextInt();  */
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int a = Integer.parseInt( reader.readLine() );
        int b = Integer.parseInt( reader.readLine() );

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
