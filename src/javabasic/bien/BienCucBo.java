package javabasic.bien;

public class BienCucBo {

    public void sayHello() {
        int n = 10;                 // Đây là biến local - biến nằm bên trong hàm
        System.out.println("Gia tri cua n la: " + n);
    }

    public void sayHi(int n1) {
        System.out.println("Gia tri cua n la: " + n1);
    }

    public static void main(String[] args) {

        String name = "Phương"; // Biến cục bộ là biến được khai báo bên trong 1 phương thức, và không được gọi/ sout bởi 1 phương thức khác
        // System.out.println(n);
        BienCucBo bienLocal = new BienCucBo();
        bienLocal.sayHello();
        bienLocal.sayHi(10);
    }




}

