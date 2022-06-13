class Animal {
    Animal(int i, int j){
        
    }
    void move() {
        System.out.println("動物怎麼動?");
    }
}
class People extends Animal {
    void move() {
        System.out.println("雙腳走路");
    }
    public String toString() {
        return "人";
    }
}
class Bird extends Animal {
    void move() {
        System.out.println("用翅膀飛行");
    }
    public String toString() {
        return "鳥";
    }
}
class Monkey extends Animal {
    void move() {
        System.out.println("四腳爬行");
    }
    public String toString() {
        return "猴子";
    }
}
public class animals {
    public static void main(String[] args) {
        Animal Jack = new People();
        Animal mark = new Monkey();
        Animal Cherry = new Bird();
        System.out.print(mark);
        mark.move();
        System.out.print(Jack);
        Jack.move();
        System.out.print(Cherry);
        Cherry.move();
    }
}
