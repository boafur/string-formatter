import java.util.Scanner;

public class formatter {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter a string");
        String a = Scanner.nextLine();
        Scanner.close();
        String result = format(a);
        System.out.println("Your formatted string is \"" + result + "\"");
    }
    public static String format(String string) {
        String result = string.substring(0, 1).toUpperCase();
        String result2 = result + string.substring(1);
        String result3 = period(result2);
        return result3;
    }
    public static String period(String str) {
        String a = str.endsWith(".") || str.endsWith("!") || str.endsWith("?") ? str : str + ".";
        return a;
    }
}
