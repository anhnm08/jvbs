package javabasic.phuongthuc;

public class TinhToan {
    public static int cong2SoNguyen(){
        return 10 + 20;
    }

    public static void cong3SoNguyen(){
        System.out.println(10 + 20 + 5);
    }

    static void welcome(String name) {
        System.out.println("Xin chào " + name);
    }

    public static void main(String[] args) {
        System.out.println(cong2SoNguyen() + 20);

        //System.out.println(cong3SoNguyen() + 20); // Int không thể cộng Void khi không return


        welcome("Mẫn");
    }
}
