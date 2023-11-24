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
            // feladat_3();
            // feladat_4();
            feladat_6();
        }

        private static void feladat_6()
        {
            var text = "1234567";
            var result = text.Select(c => c - '0').ToList();

            WriteLine(string.Join(", ", result));
        }

        private static void feladat_4()
        {
            // var input = PyUtils.Range(1, 10+1);
            var input = Enumerable.Range(1, 10);

            WriteLine(string.Join(", ", input));
            // WriteLine(string.Join(", ", result));
        }

        private static void feladat_3()
        {
            // var lista = PyUtils.Range(10);
            // var result = lista.Select(x => 0).ToList();

            var result = Enumerable.Repeat(0, 10).ToList();

            // WriteLine(string.Join(", ", lista));
            WriteLine(string.Join(", ", result));
        }
    }
}
