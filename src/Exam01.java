public class Exam01 {
    public static void main(String[] args) {
        System.out.println(isDuplicate("abbabb"));
        System.out.println(isDuplicate("abba"));
    }

    private static boolean isDuplicate(String text) {
        if (text.isEmpty())
            return true;

        var left = text.substring(0, text.length() / 2);
        var right = text.substring(text.length() / 2);

        if (left.equals(right))
            return isDuplicate(left.substring(1));

        return false;
    }
}
