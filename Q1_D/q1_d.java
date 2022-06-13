abstract class a{
    int a=10;
    int b=25;
    void a(){
        System.out.print(a+b);
    }
    void a(int a, int b){
        System.out.print(b-a);
    }
}
class a_d extends a{
    a_d(int a, int b)
    {
        this.a = a + this.b; 
        this.b = this.a + b; 
        a();
    }
}
class b_d extends a_d{
    int c = 10;
    b_d(int b, int d)
    {
        super(b, d);
        this.a = b+this.b;
        this.b = d+this.a;
    }
    void a(){
        System.out.print(this.a+c);
    }
}
public class q1_d {
    public static void main(String[] args) {
        a_d test = new a_d(10, 20);
        a_d test2 = new b_d(22,33);
        test.a();
        test2.a();
        test2.a(2,3);
    }
}
