package javabasic.phuongthuc;

public class ThongTin {
    public static void main(String[] args) {
        Company.getInfoCompany();

        //String company_name = Company.getInfoCompany();// Sẽ báo lỗi do là hàm void - hàm không trả về, nên không thể gán bằng 1 biến khác
        String company_name = Company.getCompanyName(); // được vì đều là kiểu String

        System.out.println(company_name);
    }
}
