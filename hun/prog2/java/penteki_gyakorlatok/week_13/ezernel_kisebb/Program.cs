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
            const int N = 1000;

            var result = PyUtils
                            .Range(N)
                            .Where(n => (n % 3 == 0) || (n % 5 == 0))
                            .Sum();

            WriteLine(result);
        }
    }
}
