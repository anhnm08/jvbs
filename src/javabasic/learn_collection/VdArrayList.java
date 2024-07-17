package javabasic.learn_collection;

import java.util.ArrayList;


public class VdArrayList {
    public static void main(String[]args){

        //Khai báo ArrayList
        ArrayList<String> arrayList = new ArrayList<String>();

        //Thêm phần tử vào ArrayList, bắt đầu từ 0, được phép trùng giá trị và lưu theo thứ tự input
        arrayList.add("Selenium");
        arrayList.add("Playwright");
        arrayList.add("Selenium");
        arrayList.add("Cypress");
        arrayList.add("Selenium");
        arrayList.add("Selenium");
        arrayList.add("Selenium");

        //Thêm 1 giá trị chèn vào 1 vị trí của ArrayList
        arrayList.add(2,"Katalon");
        arrayList.add(3,"akAT studio");

        //In ra cả cục ArrayList
        System.out.println(arrayList);

        //Duyệt phần tử trong ArrayList
        //Dùng vòng lặp for cơ bản
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println("___________");

        //Khai báo thêm 1 ArrayList khác
        ArrayList<String> arrayList2 = new ArrayList<String>(); // Phải cùng kiểu dữ liệu thì mới nối được 2 ArrayList
        arrayList2.add("Java");
        arrayList2.add("Python");

        // addAll để nối tất cả các phần tử trong collection c vào cuối của danh sách
        arrayList.addAll(arrayList2);

        //Remove
        arrayList.remove("Selenium");
        arrayList.remove(2);

        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        } //Gọi lại vòng lặp for 1 lần nữa để check xem in ra đúng arrayList sau khi được chập arrayList2 chưa

        System.out.println("___________");

        //Remove có điều kiện
        for (int i = 0; i < arrayList.size(); i++){
        if(arrayList.get(i).equals("Selenium")){
            arrayList.remove(i);
        }
        }
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        // Phần tên remove Selenium vẫn còn Selenium> đang giảng dở

        //Tìm kiếm giá trị phần tử
        System.out.println(arrayList.contains("Java")); //Trả ra TRue nếu thấy, False nếu không thấy

    }
}
