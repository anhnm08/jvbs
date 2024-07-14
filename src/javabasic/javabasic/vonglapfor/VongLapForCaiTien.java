package javabasic.javabasic.vonglapfor;

public class VongLapForCaiTien {
        public static void main(String[] args) {
            int array[] = { 12, 23, 44, 56, 78 };// array chứa nhiều giá trị cùng kiểu dữ liệu
            for (int i : array) {
                System.out.println(i);
            }

        // Cách 2 với for_don_gian
            for(int i = 0; i<5; i++){
                System.out.println(array[i]);
            }
        }
}

