package javabasic.toantu.toantusohoc;

public class SoHoc {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a + b= " + (a + b));
        System.out.println("a chia lấy dư cho b= " + (a % b));
        System.out.println("a = a  + b:  " + (a += b));// Sau cái này a = 30
        System.out.println("a = a  / b:  " + (a /= b)); // a= 30 chia cho 20 => kết quả ra 1

    }
}
