class Emp{
    private long emper; //员工编号
    private String ename; //员工名称
    private String dept;  //员工部门
    private double salary;  //员工工资
    public Emp(){
        this(1000,"无名氏",null,0.0);}
    public Emp(long emper)
    {
        this(emper,"新员工","未定",0.0);
    }
    public Emp(long emper,String ename,String dept){
      this(emper,ename,dept,2500.00);
    }
    public Emp(long emper,String ename,String dept,double salary)
    {
        this.emper=emper;
        this.ename=ename;
        this.dept=dept;
        this.salary=salary;
    }
    public String getInfo(){
        return "员工编号"+this.emper+"/员工名称"+this.ename+"/员工部门"+this.dept+"/员工工资"+this.salary;    }
}
public class Test {
    public static void main(String[]args){
        Emp emp= new Emp(463534);
        System.out.println(emp.getInfo());

    }
}
