import java.util.*;
public class q3 {
    static Scanner sc = new Scanner(System.in);

    static String inputAmount() {
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
        Sheet[] scoreArr = new Sheet[num];
        for (int i = 0; i < num; i++) {
            scoreArr[i] = new Sheet(i + 1, inputName(), inputAmount(), inputAmount(), inputAmount());
        }

        for (int i = 0; i < num; i++) {
            System.out.println(scoreArr[i]);
        }
        sc.close();
    }
}

class Sheet {
    public int id;
    private String name;
    private kungPaoChicken kpcPrice;
    private friedRice frPrice;
    private friedVegetables fvPrice;
    private int total_price;
    Sheet(int id, String name, String p, String c, String e) {
        this.id = id;
        this.name = name;
        this.kpcPrice = new kungPaoChicken(Integer.parseInt(p), 120);
        this.frPrice = new friedRice(Integer.parseInt(c), 150);
        this.fvPrice = new friedVegetables(Integer.parseInt(e), 200);
        cal();
    }

    @Override
    public String toString() {
        System.out.println(kpcPrice+" "+frPrice+" "+fvPrice );
        return name + "的平均是:" + total_price + "分";
    }

    public void cal() {
        total_price = (kpcPrice.totalPrice() + frPrice.totalPrice() + fvPrice.totalPrice());
    }

    class menu {
        int amount = 0;
        int price = 1;
        menu(int amount, int price) {
            this.amount = amount;
            this.price = price;
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
            return "宮保雞丁" + super.toString();
        }
    }

    class friedRice extends menu {
        friedRice(int amount, int price) {
            super(amount, price);
        }
        public String toString() {
            return "炒飯" + super.toString();
        }
    }

    class friedVegetables extends menu {
        friedVegetables(int amount, int price) {
            super(amount, price);
        }
        public String toString() {
            return "炒菜" + super.toString();
        }
    }
}