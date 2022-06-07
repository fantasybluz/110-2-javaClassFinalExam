/*
 * 介面 >> 繼承 >> 介面
 * 類別 >> 繼承 >> 類別
 * 類別 >> 繼承 >> 抽象
 */
abstract class Car{
    abstract void run();
    void refuel(){
        System.out.println("Hello");
    }
}
class BMW extends Car{
    public void run(){
        System.out.println("正在駕駛中");
    }
}
public class test{
    public static void main(String[] args) {
       System.out.println("Hello"); 
    }
}
