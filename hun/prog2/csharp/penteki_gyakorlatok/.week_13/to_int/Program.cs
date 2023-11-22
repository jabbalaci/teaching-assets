using System;
using static System.Console;
using System.Linq;
using System.Collections;
using System.Collections.Generic;

// extension methods

namespace Example
{
    public class Program
    {
        public static void Main(string[] args)
        {
            // var s = "hello";
            // var back = StringUtils.Reverse(s);
            // var back = s.ReverseStr();

            // WriteLine("oda: " + s);
            // WriteLine("vissza: " + back);

            // string s = "42";
            // int i = s.ToInt();

            // WriteLine(i);

            int year = 1977;
            int forditott = ReverseInt(year);

            WriteLine(forditott);  // 7791
        }

        private static int ReverseInt(int n)
        {
            // 1977 -> "1977" -> "7791" -> 7791
            return n.ToString().ReverseStr().ToInt();
        }
    }
}
