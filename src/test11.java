
class Perso{   //学生类继承实例
    private String name;
    private String add;
    private  char sex;
    private int age;
    public Perso(){}
    public Perso(String name,String add){
        this(name,add,'男',0);
    }
    public Perso(String name,String add,char sex,int age){
        this.name=name;
        this.add=add;
        this.sex=sex;
        this.age=age;
    }
    public String getInfo(){   //输出总结
        return "姓名："+this.name+ "地址"+this.add+"性别"+this.sex+"年龄"+this.age;
    }
    static class Studens extends Perso{    //学生继承Perso类
        private double math;
        private double english;
        public Studens(){}            //无参的构造函数
        public Studens(String name,String add){     //两个参数的构造函数
            super(name,add);    //super调用父类参数
        }
        public Studens(String name,String add,char sex,int age,double math,double english){  // 六参
            super(name,add,sex,age);
            this.math=math;        //调用本类参数
            this.english=english;
        }
        public String getInfo(){
            return super.getInfo()+"数学成绩"+this.math+"英语成绩"+this.english;   //覆写父类方法
        }}}
public class test11 {
    public static void main(String args[]) {
//        Studens stu =new Studens("张三","天安门",'男',12,67,89.5);
        Perso.Studens stu= new Perso.Studens("张三","天安门",'男',43,33.5,88.9);
        System.out.println(stu.getInfo());
    }
}
