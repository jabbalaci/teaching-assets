using System;

namespace Example
{
    public static class StringUtils
    {
        public static string Reverse(string s)
        {
            var chars = s.ToCharArray();
            Array.Reverse(chars);
            return new string(chars);
        }
    }
}
