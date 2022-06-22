import java.util.*;

class NoGasException extends Exception{
     
}

class myCar{
    double GasTank;
    double Efficient;
    
    public myCar(double g, double e){
        GasTank = g;
        Efficient = e;
    }
    public void go(double distance) throws NoGasException{
        double GasNeed = distance/Efficient;
        GasTank -= GasNeed;
        if(GasTank<0)
            throw new NoGasException();
    }
    public double checkGas(){
        return GasTank;
    }
}
class q4{
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("計算汽車耗油狀況");
        System.out.println("請輸入您的車油量(公升):");
        double g = sca.nextDouble();
        System.out.println("請輸入您的車一公升可跑的公里數:");
        double eff = sca.nextDouble();
        myCar nissan = new myCar(g, eff);
        do{
            System.out.println("您現在還有多少里程");
            double m = sca.nextDouble();
            try{
                nissan.go(m);
                System.out.println("開了"+ m + " 公里後. ");
                System.out.println("還剩 "+ nissan.checkGas() + "公升的油");
            }
            catch (NoGasException e){
                System.out.print("油量不足");
            }
        }while(nissan.checkGas()>=0);
    }
}