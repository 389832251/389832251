public class test9 { //继承练习
    public static void main(String args[]){
       Studena aa= new Studena("啊哈哈",32,"家里蹲");
       aa.eat();

    }
}
class Persona {
    private String name;
    private int age;
    private Studena studena;
    public Persona(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void eat(){
        System.out.println("吃饭了");
    }
}
class Studena extends Persona{
    private String school;
   public Studena(String name, int age, String school) {
        super(name, age);
        this.school=school;
        System.out.println(name+age+school);
    }
    public void eat(){   //Java覆写，父类中含有此方法，但是不想用的话，可以保留已有方法自己重新写一个。
       System.out.println("吃什么？");
    }
    }

