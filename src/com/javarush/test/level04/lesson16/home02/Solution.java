package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int avg = (a+b+c-max(max(a, b), c)-min(min(a, b), c));

        System.out.println(avg);
    }
   static int max(int a, int b)
{
    if (b > a) a = b;
    return a;
}
    static int min(int a, int b)
    {
        if (b < a) a = b;
        return a;
    }

}