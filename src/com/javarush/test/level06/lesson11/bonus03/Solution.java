package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int a[] = new int[5];
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        for (int i=0; i<5; i++)
        a[i] = scanner.nextInt();

        for (int j=0; j<4; j++)
            for (int i=0; i<4; i++)
                if (a[i] > a[i+1]){
                    int b = a[i];
                    a[i] = a[i+1];
                    a[i+1] = b;
                }
        for (int i=0; i<5; i++)
            System.out.println(a[i]);
    }
}
