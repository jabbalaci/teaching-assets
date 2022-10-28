package com.example;

import java.util.Objects;

public class Point
{
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return String.format("Point(x=%d, y=%d)", this.x, this.y);
    }

//    @Override
//    public boolean equals(Object obj)
//    {
//        if (obj instanceof Point)
//        {
//            Point other = (Point)obj;
//            return (this.x == other.x) && (this.y == other.y);
//        }
        // else
//        return false;
//    }

//    @Override
//    public boolean equals(Object obj)
//    {
//        if (this == obj) {
//            return true;
//        }
//        // else
//        if (!(obj instanceof Point)) {
//            return false;
//        }
//        // else
//        Point other = (Point)obj;
//        return (this.x == other.x) && (this.y == other.y);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(this.x, this.y);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
