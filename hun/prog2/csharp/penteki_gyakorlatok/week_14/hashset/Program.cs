using System;
using static System.Console;
using System.Linq;
using System.Collections;
using System.Collections.Generic;

namespace SampleApp
{
    class Program
    {
        public static void Main(string[] args)
        {
            var basket = new HashSet<string> { "alma", "dio" };
            // basket.Add("alma");
            // basket.Add("dio");
            // basket.Add("alma");
            // basket.Add("alma");
            basket.Remove("dio");

            // WriteLine(basket.Count);
            // WriteLine(string.Join(", ", basket));
            // WriteLine(basket.Contains("mogyoro"));

            var szamok = new List<int> { 7, 8, 3, 4, 3, 3, 4, 4, 7, 8, 9 };
            var result = szamok.Distinct().ToList();

            WriteLine(string.Join(", ", result));
        }
    }
}
