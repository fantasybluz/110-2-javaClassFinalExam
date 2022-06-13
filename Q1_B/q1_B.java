class a_b{
    private int a = 15;
    private int b = 10;
    a_b(int a, int b)
    {   
        a = this.a+a;
        b = this.b;
        System.out.print(a+b);
    }
    void a_b(int a, int b){
        a = this.a*2;
        System.out.print(a+this.b);
    }
}

class b_b extends a_b{
    private int a;
    private int b;
    b_b(int a, int b){
        super(a,b);
        this.b = b;
        this.a = this.a+b;
        System.out.print("222");
    }
    void a_b(int a, int b){
        a = this.a*3+b; 
        System.out.print(a+this.b);
    }

}
public class q1_B {
    public static void main(String[] args) {
        a_b test = new b_b(10,10);
        test.a_b(20,10);
    }
}
