public class FriendlyNumbers {
    static final int min_num = 1;
    static final int max_num = 10000;
    static int num[] = new int[10000];

    public static void main(String[] args) {

        for (int i = min_num; i < max_num; i++) {
            int sum1 = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    sum1 = sum1 + j;
                }
            }
            num[i] = sum1;
        }
        for (int i = min_num; i < max_num; i++) {
            int sum1 = num[i];
            if (sum1 <= max_num) {
                if (sum1 != i) {
                    if (num[sum1] == i) {
                        System.out.println(sum1 + "-" + i);
                    }
                }
            }
        }
    }
}
