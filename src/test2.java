import com.sun.deploy.util.ArrayUtil;
import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
class Car{   //汽车的定义
    private String name;
    private double price;
    private Person person;
    public Car(String name,double price){
        this.name = name;
        this.price = price;
    }
    public void setPerson(Person person){
        this.person=person;
    }
    public Person getPerson(){
        return this.person;
    }
    public String getInfo(){
        return "汽车名字"+name+"价值"+price;
    }}
class Person{    //人的定义
    private String name;
    private int age;
    private Car car;            //一个人有一个车
    private Person child[];    //一个人有多个孩子
    public Person(String name,int age) {
        this.name=name;
        this.age=age;
    }
    public String getInfo() {
        return "姓名："+this.name+"年龄"+this.age;
    }
    public void setCar(Car car){
        this.car=car;
    }
    public Car getCar(){
        return this.car;
    }
    public void setChild(Person child[]){
        this.child=child;
    }
    public Person[] getChild(){
        return this.child;
    }}

public class test2 {
    public static void main(String args[]) {
        Person person1 = new Person("张三",32);  //实例化一个人
        Person chialA =new Person("林强",32);
        Person chialb =new Person("林非",22);
        chialA.setCar(new Car("大众",22222.00));
        chialb.setCar(new Car("宝马",99999.00));
        person1.setChild(new Person[]{chialA,chialb});
        Car car =new Car("宝马",666666.00);        //实例化一辆车
        person1.setCar(car);  //一个人拥有一辆车
        car.setPerson(person1);  //一个车属于一个人
        System.out.println(person1.getCar().getInfo());     //打印汽车信息
        System.out.println(car.getPerson().getInfo());      //打印人多信息

        for (int x=0;x<person1.getChild().length;x++)
        {
            System.out.println(person1.getChild()[x].getInfo());   //打印孩子信息
           System.out.println(person1.getChild()[x].getCar().getInfo());    //打印孩子车的信息
        }
       }
    }


