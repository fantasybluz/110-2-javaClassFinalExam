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
        Sheet[] scoreArr = new Sheet[num];
        for (int i = 0; i < num; i++) {
            System.out.println("請依序填入姓名、程設分數、微積分分數、英文分數");
            scoreArr[i] = new Sheet(i + 1, inputName(), inputScore(), inputScore(), inputScore());
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
    private Programming pScore;
    private Calculus cScore;
    private English eScore;
    private float scoreAvg;
    private int credit = 9;

    Sheet(int id, String name, String _pScore, String _cScore, String _eScore) {
        this.id = id;
        this.name = name;
        this.pScore = new Programming(Integer.parseInt(_pScore), 4);
        this.cScore = new Calculus(Integer.parseInt(_cScore), 2);
        this.eScore = new English(Integer.parseInt(_eScore), 3);
        cal();
    }

    @Override
    public String toString() {
        return name +" "+ pScore.toString()+ cScore.toString()+ eScore.toString()+"總平均:" + scoreAvg + "分";
    }

    public void cal() {
        scoreAvg = (pScore.creditMultiplyScore() + eScore.creditMultiplyScore() + cScore.creditMultiplyScore())
                / credit;
    }

    class Score {
        int score = 0;
        int credit = 1;

        Score(int score, int credit) {
            this.score = score;
            this.credit = credit;
        }

        @Override
        public String toString() {
            return ":" + score;
        }

        public int creditMultiplyScore() {
            return score * credit;
        }
    }

    class Programming extends Score {
        Programming(int score, int credit) {
            super(score, credit);
        }

        @Override
        public String toString() {
            return "程式設計" + super.toString();
        }
    }

    class Calculus extends Score {
        Calculus(int score, int credit) {
            super(score, credit);
        }

        @Override
        public String toString() {
            return "微積分" + super.toString();
        }
    }

    class English extends Score {
        English(int score, int credit) {
            super(score, credit);
        }

        @Override
        public String toString() {
            return "英文" + super.toString();
        }
    }
}