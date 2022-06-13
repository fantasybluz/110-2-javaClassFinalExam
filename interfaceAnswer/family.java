interface memberName{
    void setMemberName(String x);
}
interface memberMovement{
    void setMemberName(String x);
}
class Father implements memberName, memberMovement{
    private String memberName;
    private String memberMovement;
    Father(String _memberName, String _memberMovement){
       this.memberName = _memberName; //setMemberName(_memberName)
       this.memberMovement = _memberMovement;
    }
    public void setMemberName(String memberName){
        this.memberName = memberName;
    }
    public void setMemberMovement(String memberMovement){
        this.memberMovement = memberMovement;
    }
    public String toString(){
        return this.memberName + "在" + this.memberMovement;
    }
}
public class family {
    public static void main(String[] args) {
        Father father = new Father("爸爸","睡覺");
        System.out.println(father);
        father.setMemberMovement("工作");
        System.out.println(father);
    }  
}
