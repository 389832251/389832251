public class test8 {  //截取练习
    public static void main(String args[]) {
        String str = "dkfhlsie-换的行符的回复4534g";
        System.out.println(str.substring(9,16));

//        int kaishi =str.indexOf("的",str.indexOf("符"))+1;//截取的开始位置：有两个的，截取符开始的那个“的”
//                                                             //+1 的意思是往后挪一个字符
//        int jieshu =str.lastIndexOf("g");                  //截取的结束的字符
//        System.out.println(str.substring(kaishi,jieshu));
        System.out.println(str.substring(9,16));
    }
}