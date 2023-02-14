package org.example.hw4;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args)
    {
        double Perimeter, s, Area;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Введите три значения для треугольника: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Perimeter = a + b + c;
        s = Perimeter/2;
        Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));


        System.out.format("\n Периметр треугольника = %.2f\n", Perimeter);
        System.out.format("\n Полупериметр треугольника = %.2f\n",s);
        System.out.format("\n Площадь треугольника = %.2f\n",Area);
    }
}
