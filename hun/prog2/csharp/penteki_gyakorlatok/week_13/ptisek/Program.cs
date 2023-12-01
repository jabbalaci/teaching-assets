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
            var fname = "nevek.csv";
            List<string> lines = FileUtils.ReadLines(fname);

            // foreach (var line in lines)
            // {
                // WriteLine(line);
            // }

            var students = lines.Select(line => new Student(line));
            var ptisek = students
                            .Where(st => st.GetMajor() == "PTI");

            foreach (var st in ptisek)
            {
                WriteLine(st);
            }


            foreach (var student in students.OrderBy(st => st.GetAge()))
            {
                WriteLine(student);
            }
        }
    }
}
