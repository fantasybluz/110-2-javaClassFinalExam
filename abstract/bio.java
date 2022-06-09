import java.util.*;
abstract class Animal{
    int height, weight;
    void move(){
        System.out.println("移動");
    }
    void voice(){
        System.out.println("發出聲音");
    }
}

class people extends Animal{
    int height = 180;
    int weight = 70;
    // void move(){
    //     System.out.println("用腳走路");
    // }
    void voice(){
        System.out.println("講人話");
    }
}
public class bio {
    public static void main(String[] args) {
        people mark = new people();
        System.out.println(mark.height);
    }  
}
