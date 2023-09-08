package com.example;

public class Main
{
    public static void main(String[] args)
    {
	    Point p1 = new Point(2, 5);
        Point p2 = new Point(2, 5);

        System.out.println(p1);
        System.out.println(p1.hashCode());
        System.out.println(p2);
        System.out.println(p2.hashCode());
        System.out.println(p1 == p2);
        System.out.println("--------------");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals("hello"));
        System.out.println(p1.equals(p1));
        System.out.println("--------------");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.hashCode() == p2.hashCode());
    }
}
