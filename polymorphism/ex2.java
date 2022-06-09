package polymorphism;
/*只要可以視為Animal的物件，就可以使用這個方法而不會出錯。 
這樣的設計方式可以降低方法定義對類別的依賴，使用一個制定好的介面，
利用該介面來操作不同的物件，增加程式的彈性及可維護性，設計上也比較有架構。
*/
import java.util.*;
class Animal {
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
public class ex2 {
    public static void main(String[] args) {
        Animal Jack = new People();
        Animal mark = new Monkey();
        Animal Cherry = new Bird();
        moveAnimal(Jack);
        moveAnimal(mark);
        moveAnimal(Cherry);
    }
    static void  moveAnimal(Animal ani){
        ani.move();
    }
}
