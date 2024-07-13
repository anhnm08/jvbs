package javabasic.kieudulieu;

public class KieuDuLieu {

    public static void main(String[] args) {
        String description = "Hello";
        String poem = "Eeny, meeny miny, moe,\n" +
                "Catch a tiger by the toe,\n" +
                "If he hollers, let him go,\n" +
                "Eeny, meeny, miny, moe.";
        System.out.println(description);
        System.out.println(poem);

        byte number = -128; // kích cỡ 1 byte, lưu số nguyên [-128;127]
        short number2 = -32768; // kích cỡ 2 byte, lưu số nguyên [-32768;32767]
        int number3 = 200; // kích cỡ 4 byte, lưu số nguyên [-2 tỷ 1;2 tỷ 1]
        long number4 = 1000L; // kích cỡ 8 byte (thường dùng trong ngân hàng, thống kê); có chữ L ở cuối số

        //char lưu kí tự, để trong dấu nháy đơn

        boolean checkValue = true;
        float number5 = 123.456F; // float lưu số thực, thập phân; kích cỡ 4 byte; có chữ F ở cuối số
        double number6 = 1234.567D; // lưu số thực, kích cỡ 8 byte; có chữ D ở cuối số

    }

}
