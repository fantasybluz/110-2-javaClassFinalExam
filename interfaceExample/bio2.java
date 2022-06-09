import java.util.*;
interface animal2{
    int weight=0;
    int height=0;
    void move();
    void say();
}
class people2 implements animal{
    public void move(){
        System.out.println("雙腳移動");
    }
    public void say(){
        System.out.println("說人話");
    }
    public String toString() {
        return "people";
    }
}
class monkey implements animal{
    public void move(){
        System.out.println("爬行");
    }
    public void say(){
        System.out.println("吱吱叫");
    }
    public String toString() {
        return "I am Monkey";
    }
}
public class bio2 {
    public static void main(String[] args) {
        monkey mark = new monkey();
        System.out.println(mark);
        mark.move();
        mark.say();

    }
}
