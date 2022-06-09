import java.util.*;
interface animal3{
    int weight=0;
    int height=0;
    void move();
    void say();
}
interface animal_like extends animal3{
    void habbit();
    void favor();
}
class monkey3 implements animal_like{
    public void move(){
        System.out.println("爬行");
     }
    public void say(){
        System.out.println("吱吱叫");
    }
    public void habbit(){
       System.out.println("爬樹");
    }
    public void favor(){
       System.out.println("吃香蕉");
    } 
}

public class bio3 {
    public static void main(String[] args) {
        monkey3 mark = new monkey3();
        mark.say();
        mark.move();
        mark.favor();
        mark.habbit();
        
    }
}
