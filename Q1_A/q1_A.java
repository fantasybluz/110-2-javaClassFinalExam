class A{
    int a = 11;
    A(){};
    A(int a,int b)
    {
        System.out.print("111");
    }
    void A(int ...a){
        System.out.print(this.a);
        A(1,2);
    }
}
class B extends A{
    int a =22;
    void A(int a, int b)
    {
        System.out.println(this.a);
    }
}
public class q1_A {
    public static void main(String[] args) {
        A b = new B();
        b.A(1,2);
    }
}
