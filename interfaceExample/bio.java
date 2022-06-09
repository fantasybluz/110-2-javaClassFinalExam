import java.util.*;
interface animal{
    int weight=0;
    int height=0;
    void move();
    void say();
}
class people implements animal{
    public void move(){
        System.out.println("雙腳移動");
    }
    public void say(){
        System.out.println("說人話");
    }
    public String toString() {
        return "I am people";
    }
}
public class bio {
    public static void main(String[] args) {
        people mark = new people();
        System.out.println(mark);
        mark.move();
        mark.say();
    }
}
