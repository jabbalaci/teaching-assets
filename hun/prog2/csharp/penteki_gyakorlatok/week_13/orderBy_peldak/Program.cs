using System;
using static System.Console;
using System.Linq;
using System.Collections;
using System.Collections.Generic;

namespace Example
{
    public class Program
    {
        private static Random rand = new Random();

        public static void Main(string[] args)
        {
            var szamok = new List<int> { 7, 3, 4, 5, 9, 4, 2, 3 };

            // WriteLine(string.Join(", ", szamok));
            // var rendezett = szamok.OrderByDescending(x => x).ToList();
            // WriteLine(string.Join(", ", rendezett));
            // WriteLine(string.Join(", ", szamok));

            // 1. módszer: manuálisan leprg.-ozzuk
            // 2. módszer:

            var shuffled = szamok.OrderBy(x => rand.Next()).ToList();
            WriteLine(string.Join(", ", shuffled));
        }
    }
}
