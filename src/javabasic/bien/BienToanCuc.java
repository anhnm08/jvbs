package javabasic.bien;

public class BienToanCuc {

    //Biến toàn cục
    String name = "Phương";
    int age = 32;
    String address = "Hà Nội";

    public void getInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Address: "+ address);
    }

    public static void main(String[] args) {
        BienToanCuc bienInstance = new BienToanCuc();// Khởi tạo đối tượng
        bienInstance.getInfo();
    }
}
