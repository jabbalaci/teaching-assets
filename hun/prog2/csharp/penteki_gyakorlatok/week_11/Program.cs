using System;
using static System.Console;
// using System.Linq;
// using System.Collections;
// using System.Collections.Generic;

namespace Example
{
    public class Program
    {
        public static void Main(string[] args)
        {
            // Write("Neved: ");
            // string name = Console.ReadLine();
            // WriteLine("Hello " + name + "!");

            // WriteLine(Duplaz(5));               // PascalCase, camelCase, snake_case

            // string name = Input("Neved: ");
            // WriteLine("Hello " + name + "!");

            // int x = 2;
            // WriteLine(x);
            // double pi = 3.14;
            // char c = 'a';
//
            // var y = 5;
            // var pi = 3.14;
            // var s = "hello";
//
            // int result = MyClass.MagicMethod();

            var s = "Batman";
            WriteLine(s[1..^1]);
        }

        private static int Duplaz(int n)
        {
            return 2 * n;
        }
    }
}
