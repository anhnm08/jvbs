package javabasic.caulenhdieukien;

public class SwitchCase {
    // cùng một điều kiện đầu vào duy nhất, switch case giúp kiểm tra nhiều trường hợp xảy ra
    public static void main(String[] args) {
        int number = 20;
        switch (number) {
            case 10:
                System.out.println("10");
                break;// mục đích để không xét các case khác khi gặp đúng điều kiện
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }
    }
}
