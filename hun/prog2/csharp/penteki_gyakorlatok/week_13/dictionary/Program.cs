using System;
using System.Text;
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
            var d = new Dictionary<string, string> {
                {"one", "egy"},
                {"two", "kettő"},
                {"three", "három"}
            };
            // d["one"] = "egy";
            // d["two"] = "kettő";
            // d["three"] = "három";
            PrettyPrint(d);
            WriteLine(d["one"]);
            WriteLine(d.GetValueOrDefault("four", "X"));
            d["one"] = "EGY";
            PrettyPrint(d);
            WriteLine("-----------");
            foreach (var value in d.Values)
            {
                WriteLine(value);
            }
            WriteLine("-----------");
            foreach (var pair in d)
            {
                WriteLine($"{pair.Key} -> {pair.Value}");
            }
            WriteLine("-----------");
            WriteLine(d.ContainsValue("kettő"));
            d.Remove("one");
            PrettyPrint(d);
        }

        private static void PrettyPrint(Dictionary<string, string> d)
        {
            var sb = new StringBuilder("{");

            foreach (var key in d.Keys)
            {
                sb.Append($"{key}: {d[key]}, ");
            }

            sb.Append("}");
            WriteLine(sb);
        }
    }
}
