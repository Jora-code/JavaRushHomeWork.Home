package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //add your code here -  добавь код тут
        int i = 0;
        while (i<list.size())
        {
            if ((list.get(i).contains("р"))||(list.get(i).contains("л"))){
                if ((list.get(i).contains("р"))&&(!list.get(i).contains("л")))
                    list.remove(i);

                if ((!list.get(i).contains("р"))&&(list.get(i).contains("л"))){
                    list.add(i+1, list.get(i));
                    i = i + 2;
                    if (i>=list.size()) break;
                }

                if ((list.get(i).contains("р"))&&(list.get(i).contains("л"))) i++;
            } else i++;
        }
        return list;
    }
}