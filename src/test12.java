class Employee{  //创建员工类
    private String name;
    private int age;
    private String sex;
    public Employee(){
    }
    public Employee(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public String getInfo(){
        return "姓名："+this.name+"年龄："+this.age+"性别："+this.sex;
    }
}
class Manager extends Employee{  //创建管理层类
    private String job;
    private double income;
    public Manager(){}
    public Manager(String name,int age,String sex,String job,double income){
        super(name,age,sex);
        this.job=job;
        this.income=income;
    }
    public String getInfo(){
        return "管理层"+super.getInfo()+"职位："+this.job+"年薪："+this.income;
    }
}
class Staff extends Employee{
    private String dept;
    private double salary;
    public Staff(){}
    public Staff(String name,int age,String sex,String dept,double salary){
        super(name,age,sex);
        this.dept=dept;
        this.salary=salary;
    }
    public String getInfo(){
        return "职员："+super.getInfo()+"部门："+this.dept+"工资："+this.salary;
        }}

public class test12 {
       public static void main(String args[]){
          Manager man = new Manager("张三",23,"男","主管",200000);  // 实例化管理层
           Manager sta = new Manager("王五",32,"男","技术部",8888);
           Staff st =new Staff("张三",34,"男","维修部",5000);
           System.out.println(man.getInfo());
           System.out.println(sta.getInfo());
           System.out.println(st.getInfo());

       }
}

