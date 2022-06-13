public class q2_a {
    static void test(){
        try{
            int a = 0;
            int c= 10/a;
            System.out.println(c);
        }finally{System.out.print("好想過暑假");}
    }
    public static void main(String[] args) {
        try{
            test();
        }catch(Exception ex)
        {
            System.out.print("我好想過");
        }finally{
            System.out.print("不要當掉我");}
    }
}
