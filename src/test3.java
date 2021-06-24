public class test3 {
    public static void main(String args[])
    {
        int arr []=new int[]{1644,2,35,4,5};
        Unit yy=new Unit(arr);
        System.out.println("平均"+yy.getAvg());
        System.out.println("最大"+yy.getMax());
        System.out.println("最小"+yy.getMin());
        System.out.println("总和"+yy.getSum());
    }
}
class Unit{   //定义一个新的工具类
    private int sum;
    private double avg;
    private int max;
    private int min;
    public Unit(int arr[]) {   //取出数组内最大值，最小值，总和平均数的方法。
        this.max =arr[0];
        this.min =arr[0];
     for (int x=0;x<arr.length;x++) {
         this.sum+=arr[x];
         this.avg= sum/arr.length;
         if (arr[x]>max) {
             this.max=arr[x];
         }
         else if (arr[x]<min){
             this.min=arr[x];
         }
     }
    }
    public int getMax() {     //获取私有属性的方法
        return this.max;
    }
    public double getAvg() {
        return this.avg;
    }
    public int getMin(){
        return this.min;
    }
    public int getSum() {
        return this.sum;
    }
}
