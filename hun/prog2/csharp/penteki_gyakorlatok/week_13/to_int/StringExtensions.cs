using System;

namespace Example
{
    public static class StringExtensions
    {
        public static string ReverseStr(this string str)
        {
            var chars = str.ToCharArray();
            Array.Reverse(chars);
            return new string(chars);
        }

        public static int ToInt(this string str)
        {
            return int.Parse(str);
        }
    }
}
