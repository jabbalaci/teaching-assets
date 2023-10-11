public class StringUtils
{
    private StringUtils() {
        // nem példányosítható
    }

    public static String swapCase(String s)
    {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray())
        {
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            }
            else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }
            else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
