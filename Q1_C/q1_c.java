interface a{
    int a = 5;
    int b = 12;
    void a();
}
interface b extends a{
    int a = 15;
    void b();
}
class a_c implements b{
    a_c(int a, int c){
        System.out.print(this.a+b);
        b();
    }
    public void a(){
        System.out.print(a+this.b);
    }
    public void b(){
        System.out.print(a+b);
    }
}
class b_c extends a_c {
    private int a = 5;
    private int b = 10;
    b_c(int b, int d)
    {
        super(b,d);
        this.a = b;
        b();
    }
    public void b(){
        System.out.print(this.a*this.b);
    }
}
public class q1_c {
    public static void main(String[] args) {
        b_c test = new b_c(12,10);
        a_c test2 = new b_c(10, 20);
        test.a();
        test2.b();
    }
}
