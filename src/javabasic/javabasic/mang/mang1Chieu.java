package javabasic.javabasic.mang;

public class mang1Chieu {
    public static void main(String[] args) {
        //Khai báo mảng để lưu gia trị số nguyên
        int songuyen[] = new int[10];

        //Gán giá trị cho mảng
        songuyen[0] = 5;
        songuyen[1] = 7;
        songuyen[6] = 9;

        /* gán giá trị thông qua for
        for(int i = 0; i< songuyen.length; i++){ // toàn bộ giá trị cửa mảng sau code này sẽ là 5
            songuyen[i] = 5;
        }
        */


        System.out.println(songuyen[6]); //lấy ra 1 giá trị cụ thể

        //Truy xuất giá trị trong mảng
        for(int i= 0; i < 10; i++){
            System.out.println(songuyen[i]); //for để lấy ra tất cả các giá trị
        }


    }
}
