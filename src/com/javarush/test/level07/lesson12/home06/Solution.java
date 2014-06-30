package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы
получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human grFa1 = new Human("Павел", true, 55, null, null);
        Human grMo1 = new Human("Катя", false, 55, null, null);
        Human grFa2 = new Human("Толя", true, 55, null, null);
        Human grMo2 = new Human("Таня", false, 55, null, null);
        Human Fa = new Human("Михаил", true, 21, grFa2, grMo2);
        Human Mo = new Human("Аня", false, 21, grFa1, grMo1);
        Human S = new Human("Игорь", true, 2, Fa, Mo);
        Human D1 = new Human("Света", false, 3, Fa, Mo);
        Human D2 = new Human("Лена", false, 4, Fa, Mo);

        System.out.println(grFa1);
        System.out.println(grMo1);
        System.out.println(grFa2);
        System.out.println(grMo2);
        System.out.println(Fa);
        System.out.println(Mo);
        System.out.println(S);
        System.out.println(D1);
        System.out.println(D2);
    }

    public static class Human
    {
        //Написать тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
