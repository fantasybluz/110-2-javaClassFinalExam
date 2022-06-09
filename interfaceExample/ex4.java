interface head{
    String hair = "短髮";
    String glasses = "方框";
    void showHead ();
}
interface leg{
    String sock_color = "白色";
    String shoes = "Nike";
    void showLeg();
}

class mark implements head, leg{
    public void showHead(){
        System.out.println("頭髮是"+hair+"，鏡框是"+glasses);
    }
    public void showLeg(){
        System.out.println("穿的是:"+sock_color+shoes);
    }
}
public class ex4 {
    public static void main(String[] args) {
        mark people = new mark();
        people.showHead();
        people.showLeg();
    }
}
