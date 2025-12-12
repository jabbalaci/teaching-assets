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
            // pelda_1();
            // pelda_2();
            pelda_3();
        }

        private static void pelda_1()
        {
            var words = new List<string> { "ccc", "aaaa", "d", "bb" };

            // WriteLine(string.Join(", ", words));
            // words.Sort();
            // WriteLine(string.Join(", ", words));

            var result = words.OrderBy(s => s.Length).ToList();
            WriteLine(string.Join(", ", result));
        }

        private static void pelda_2()
        {
            var words = new List<string> { "xc", "zb", "yd", "wa" };

            // WriteLine(string.Join(", ", words));
            // words.Sort();
            // WriteLine(string.Join(", ", words));

            var result = words.OrderBy(s => s[^1]).ToList();
            WriteLine(string.Join(", ", result));
        }

        private static void pelda_3()
        {
            // int MyFunc(string user)
            // {
                // return int.Parse(user.Split(':')[0]);
            // }

            var users = new List<string> {
                "10:User1",
                "80:User2",
                "100:User3",
                "00:User4",
                "75:User4",
                "45:User5"
            };

            // WriteLine(string.Join(", ", users));
            // users.Sort();
            // WriteLine(string.Join(", ", users));

            var result = users.OrderBy(user => int.Parse(user.Split(':')[0])).ToList();
            WriteLine(string.Join(", ", result));
        }
    }
}
