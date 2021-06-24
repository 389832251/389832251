class Yonghu{ //分类与子分类的多对多的关系
    private String mid;
    private String name;
    private Shangpin shangpins[];
    public Yonghu(String mid,String name){
        this.mid=mid;
        this.name=name;
    }
    public String getInfo(){
        return "用户信息"+this.mid+"用户名称"+this.name;    }
    public void setShangpins(Shangpin shangpins[]){
        this.shangpins=shangpins;
    }
    public Shangpin [] getShangpins(){
        return this.shangpins;
    }
}
class Shangpin{
    private long mid;
    private String title;
    private double price;
    private Yonghu yonghus[];
    public Shangpin(long mid,String title,double price){
        this.mid=mid;
        this.title=title;
        this.price=price;
    }
    public void setYonghus(Yonghu yonghus[]){
        this.yonghus=yonghus;
    }
    public Yonghu []getYonghus(){
        return this.yonghus;
    }
    public String getInfo()
    {
        return "商品信息:"+this.mid+"title:"+this.title+"价格:"+this.price;
    }

}

public class test7 {
    public static void main(String args[]) {
        Yonghu yonghu1 = new Yonghu("mld", "航三");
        Yonghu yonghu2 = new Yonghu("kkk", "王五");
        Shangpin shangpin1 = new Shangpin(11L, "开发书籍", 55.5);
        Shangpin shangpin2 = new Shangpin(22L, "手机", 5555.00);
        Shangpin shangpin3 = new Shangpin(99L, "电脑", 88888.00);
        yonghu1.setShangpins(new Shangpin[]{shangpin1, shangpin2, shangpin3});
        yonghu2.setShangpins(new Shangpin[]{shangpin1});
        shangpin1.setYonghus(new Yonghu[]{yonghu1,yonghu2});
        shangpin2.setYonghus(new Yonghu[]{yonghu1});
        shangpin3.setYonghus(new Yonghu[]{yonghu1});
//        System.out.println(shangpin1.getInfo());
        System.out.println("------------根据用户-------------------");
        for (int x = 0; x < shangpin1.getYonghus().length; x++) {
            System.out.println(shangpin1.getYonghus()[x].getInfo());
        }
        System.out.println("------------根据商品-------------------");
        for (int x = 0; x < yonghu1.getShangpins().length; x++) {
            System.out.println(yonghu1.getShangpins()[x].getInfo());
        }
    }
    }