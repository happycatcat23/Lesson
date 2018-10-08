package question13;

public class Question13_1 {
    public static void main(String args[]) {

        int num;
        num = 5 * 6;

        String str = "実行されました";

        if (num >= 25 && (num >= 30 && 5000 > num)) {
            boolean testFlag = true;
            if (testFlag) {
                System.out.println(str);
            }
        }

        System.out.println("処理を終了します");
    }
}
