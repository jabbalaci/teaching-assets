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
            var numbers = new List<int> {1, 9, 8, 3};

            var result = numbers
                            .Where(x => x % 2 == 1)
                            .Select(x => x * x)
                            .Sum();

            WriteLine(result);
            // WriteLine(string.Join(", ", result));
        }
    }
}
