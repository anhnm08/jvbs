package javabasic.caulenhdieukien;

public class DieuKienIfElse {
    public static void main (String [] args){


        int number1 = 10;
        int number2 = 20;
        String message = "add category successfully";
// câu lệnh if
        if((number1 < number2) && message.equals("add category successfully") ){
            System.out.println("number 1 < number 2");
        }

//câu lệnh if else
        if((number1 == number2) && message.equals("add category successfully") ){
            System.out.println("Thoả mãn điều kiện");
        }
        else{
            System.out.println("Không thoả mãn điều kiện");
        }

//

    }
}
