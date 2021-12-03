using System;
using static System.Console;
using System.Linq;
using System.Collections;
using System.Collections.Generic;

namespace Example
{
    public class Program
    {
        public static void Main(string[] args)
        {
            kiir(PyUtils.Range(0, 5));         // 0, 1, 2, 3, 4
            kiir(PyUtils.Range(10));           // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            kiir(PyUtils.Range(4, 20, 2));     // 4, 6, 8, 10, 12, 14, 16, 18
        }

        private static void kiir(List<int> li)
        {
            WriteLine(string.Join(", ", li));
        }
    }
}
