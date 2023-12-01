using System;
using System.Collections.Generic;
using System.Text;

namespace Example
{
    public static class StringExtensions
    {
        public static string Capitalize(this string s)
        {
            return char.ToUpper(s[0]) + s[1..].ToLower();
        }
    }
}
