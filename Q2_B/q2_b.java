//ocp 16
public class q2_b {
    static void exam() {
        try {
            String x = null;
            System.out.print(x.toString() + " ");
        } finally {
            System.out.print("finally ");
        }
    }
    public static void main(String[] args) {
        try {
            exam();
        } catch (Exception ex) {
            System.out.print("exception ");
        }
    }
}