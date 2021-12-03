using System.Collections.Generic;

namespace Example
{
    public class PyUtils
    {
        public static List<int> Range(int start, int end, int step)
        {
            var result = new List<int>();

            for (var i = start; i < end; i += step)
            {
                result.Add(i);
            }

            return result;
        }

        public static List<int> Range(int start, int end)
        {
            return PyUtils.Range(start, end, 1);
        }

        public static List<int> Range(int end)
        {
            return PyUtils.Range(0, end);
        }
    }
}
