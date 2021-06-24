abstract class Message{   //定义抽象类
    private String type;
    public abstract String getConnectInfo();  //定义抽象方法
   public void setType(String type){    //普通方法
       this.type=type;
   }
   public String getType(){     //普通方法
       return this.type;
   }
}
class DatabseMessage extends Message{  //子类继承父类
    public String getConnectInfo(){    // 覆写抽象类方法
        return "Oracle数据库连接信息";
    }

}
public class test13 {
    public static void main(String args[]){
        Message msg = new DatabseMessage();
        msg.setType("客户消息");
        System.out.println(msg.getConnectInfo());
        System.out.println( msg.getType());
    }
}
