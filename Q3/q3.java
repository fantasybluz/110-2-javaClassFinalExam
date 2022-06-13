import java.util.*;
public class q3 {
    static Scanner sc = new Scanner(System.in);

    static String inputScore() {
        String a = sc.nextLine();
        return a;
    }

    static String inputName() {
        String a = sc.nextLine();
        return a;
    }

    public static void main(String[] args) {
        int num = sc.nextInt();
        sc.nextLine();
        Student[] scoreArr = new Student[num];
        for (int i = 0; i < num; i++) {
            scoreArr[i] = new Student(i + 1, inputName(), inputScore(), inputScore(), inputScore());
        }

        for (int i = 0; i < num; i++) {
            System.out.println(scoreArr[i]);
        }
        sc.close();
    }
}

class Student {
    public int id;
    private String name;
    private Programming pScore;
    private Chinese cScore;
    private English eScore;
    private float scoreAvg;
    private int credit = 9;

    Student(int id, String name, String p, String c, String e) {
        this.id = id;
        this.name = name;
        this.pScore = new Programming(Integer.parseInt(p), 120);
        this.cScore = new Chinese(Integer.parseInt(c), 150);
        this.eScore = new English(Integer.parseInt(e), 200);
        cal();
    }

    @Override
    public String toString() {
        return name + "的平均是:" + scoreAvg + "分";
    }

    public void cal() {
        scoreAvg = (pScore.creditMultiplyScore() + eScore.creditMultiplyScore() + cScore.creditMultiplyScore())
                / credit;
    }

    class menu {
        int amount = 0;
        int pirce = 1;

        memu(int amount, int credit) {
            this.amount = amount;
            this.pirce = pirce;
        }

        @Override
        public String toString() {
            return "數量:" + amount;
        }

        public int totalPrice() {
            return amount * price;
        }
    }

    class kungPaoChicken extends menu {
        kungPaoChicken(int amount, int pirce) {
            super(amount, pirce);
        }

        @Override
        public String toString() {
            return "宮保雞丁:" + super.toString();
        }
    }

    class friedRice extends menu {
        friedRice(int amount, int price) {
            super(amount, price);
        }
        public String toString() {
            return "炒飯:" + super.toString();
        }
    }
    class friedVegetables extends menu {
        friedRice(int amount, int price) {
            super(amount, price);
        }
        public String toString() {
            return "炒菜菜:" + super.toString();
        }
    }
}