package org.example.hw4;

public class Triangle2 {

    public double someMethod(int a, int b, int c) throws MyException {
        if(a<0 || b<0 || c <0) throw new MyException("Неверное значение");
        int perimeter = a + b + c;
        int s = perimeter/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
}
