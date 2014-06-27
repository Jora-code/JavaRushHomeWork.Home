package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while. Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int x =1, y=1;
        while (y<11)
        {
            while (x<11)
            {
                System.out.print("S");
                x++;
            }
            y++;
            x = 1;
            System.out.println();
        }
    }
}
