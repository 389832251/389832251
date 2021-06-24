public class test4 {
    public static void main(String[]args) {
        int temp[] = new int[]{8, 9, 0, 2, 3, 5, 10, 7, 6, 1};
       Toola.Toola(temp);
        printArray(temp);
    }
    public static void printArray(int temp[])  //打印数组
    {
        for (int x=0;x<temp.length;x++) {
            System.out.print(temp[x]+" ,");
    }System.out.println();
    }
}
class Toola{
    public static void Toola(int temp[]){      //运营static 就可以直接用类名调用，不用new。
        //为什么不实例化new以后调用？因为类中没有属性，实例化了以后没有意义
        for (int y=0;y<temp.length;y++){  //定义循环次数
        for (int x=0;x<temp.length-1;x++)   //数组排序
        {
            if (temp[x]>temp[x+1])       //数据比较
            {
                int yy=temp[x];     //排序
                temp[x]=temp[x+1];
                temp[x+1]=yy;
            }
        }}
    }
}