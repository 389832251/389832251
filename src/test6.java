class Item{   //分类与子分类的一对多的关系
    private long id;
    private String title;
    private Subitem subitems[];
    public Item(long id,String title){
        this.id=id;
        this.title=title;
    }
    public void setSubitems(Subitem subitem[]){
        this.subitems=subitems;
    }
    public Subitem[] getSubitems(){
        return this.subitems;
    }
    public String getInfo(){
        return "分类信息：id="+this.id+"title：="+this.title;

    }
}
class Subitem{
    private long sid;
    private String title;
    private Item item;
    public Subitem(long sid,String title){
        this.sid=sid;
        this.title=title;
    }
    public void setItem(Item item){
        this.item=item;
    }
    public Item getItem(){
        return this.item;
    }
    public String getInfo(){
        return "子分类信息：id="+this.sid+"title="+this.title;
    }
}
public class test6 {
    public static void main(String arg[]) {
       Item item=new Item(11L,"图书");
       Subitem subitems[] = new Subitem[]{
               new Subitem(10L,"编程书"),
               new Subitem(20L,"舞蹈书"),
       };
       item.setSubitems(subitems);
       for (int x=0;x<subitems.length;x++){
           subitems[x].setItem(item);
       }
       System.out.println(item.getInfo());
       for (int x=0;x<subitems.length;x++){
           System.out.println(subitems[x].getInfo());
       }


    }
}
