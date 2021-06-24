class fulei{  //练习属性的覆盖
    private String info = "哈哈哈";  //私有属性
    public String getInfo(){
        return this.info;
    }
}
class Zilei extends fulei{
    String info ="呵呵呵呵呵";
    //当父类中的属性是私有化时，父类中的info跟子类中的已经没有关系了，及时名称一样，其实也是定义的一个新的属性
    public void fun(){
        System.out.println(this.info);
        System.out.println(super.getInfo());

    }
}
public class test10 {
    public static void main(String args []){
        Zilei zizi =new Zilei();
        zizi.fun();


        System.out.println();
    }
}
