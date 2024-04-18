
public class Main {
    public static void main(String[] args) {
        System.out.println(appendNTimes("dog", 4));
        System.out.println(appendNTimesIterative("dog", 4));
        System.out.println(powerOf2GreaterThan(3));
        System.out.println(powerOf2GreaterThanIterative(3));
    }

    public static String appendNTimes(String str, int n) {
        if (n <= 0) {
            return "";
        }
        return str + appendNTimes(str, n - 1);
    }

    public static String appendNTimesIterative(String str, int n) {
        StringBuilder myString = new StringBuilder();
        for (int i = 0; i < n; i++) {
            myString.append(str);
        }
        return myString.toString();
    }

    public static int powerOf2GreaterThan(int n) {
        if (n <= 0) {
            return 1;
        }
        int power = powerOf2GreaterThan(n >> 1);
        return power << 1;
    }

    public static int powerOf2GreaterThanIterative(int n) {
        if (n <= 0) {
            return 1;
        }
        int power = 1;
        while (power <= n) {
            power++;
        }
        return power;
    }
}






