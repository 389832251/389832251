class Dept{
    private long deptno;  //编号
    private String dname; //部门名称
    private String loc;    //部门位置
    private Emp   emps[];
    public Dept(long deptno,String dname,String loc) {
        this.deptno=deptno;
        this.dname=dname;
        this.loc=loc;
    }
    public void setEmps(Emp emps[]){
        this.emps =emps;
    }
    public Emp[]getEmps(){
        return this.emps;
    }
    public String gefInfo(){
        return "部门编号 ="+this.deptno+"  部门名称 ="+this.dname+"  部门位置 ="+this.loc;
    }}
class  Empa{
    private long empno;
    private String ename;
    private String job;
    private double sallary;
    private double comm;
    private Dept dept;//所属部门
    private Emp mgr;   //所属领导
    public Empa(long empno,String ename,String job,double sallary,double comm){
        this.empno=empno;
        this.ename=ename;
        this.job=job;
        this.sallary=sallary;
        this.comm=comm;
    }
    public String getInfo(){
        return "雇员编号"+this.empno+"雇员姓名"+this.ename+"雇员工作"+this.job+"基本工资"+this.sallary+"提成"+this.comm;
    }
    public void setDept(Dept dept){
        this.dept=dept;
    }
    public void setMgr(Emp mgr){
        this.mgr=mgr;
    }
    public Dept getDept(){
        return this.dept;
    }
    public Emp getMgr(){
        return this.mgr;
    }
}
public class test5{
    public static void main(String args[])
    {
     Dept dept=new Dept(35,"财务部","上海");
     Empa empa = new Empa(3245,"莎莎","前台",800.00,0.0);
        Empa empb = new Empa(3245,"拉了","前台",800.00,0.0);
        Empa empc = new Empa(3245,"哈哈","前台",800.00,0.0);
        empa.setDept(dept);
        empb.setDept(dept);
        empc.setDept(dept);

    }
}


