package javabasic.toantu.toantulogic;
public class TTLogic {
    public static void main(String[] args) {

    String message1 = "Login successful";
    String message2 = "Login successfully";
    int number1 = 10;
    int number2 = 20;
    int number3 = 10;

    // Toan tu lohic cho phep ket hop cac toan tu khac lai voi nhau
/* Toán tử AND (&&):
+ chỉ đúng khi tất cả các điều kiện đúng, ngược lại sẽ sai khi có 1 điều kiện sai
+ dùng để kết hợp các loại điều kiện khác nhau
*/
    System.out.println("Message status: " + (message1 != message2)); //F
    System.out.println((message1 != message2 ) && ( number1 == number3 )); //F
    System.out.println((number1 < number2 ) && ( number1 == number3 )); //T

/* Toán tử OR (||):
+ sẽ đúng khi 1 trong các điều kiện đúng, ngược lại sẽ sai khi tất cả điều kiện sai
+ dùng để kết hợp nhiều các điều kiện cùng loaị
*/
    System.out.println(( number1 > number2 ) || ( number1 != number3 ) || ( number2 == number3 )); //F
    System.out.println(( number1 < number2 ) || ( number1 != number3 )); //T
/* Toán tủ XOR (^):
+ chỉ đúng khi chỉ có duy nhất 1 điều kiện đúng, còn các điều kiện khác sai
*/
    System.out.println(( number1 > number2 ) || ( number1 == number3 ) || ( number2 == number3 )); //T

/* Toán tử NOT (!):
+ chuyển True thành False và ngược lại
*/

//Toán tử Gán: Điều kiện dùng toán tử gán là tất cả các biến cùng kiểu dữ liệu
    int var = 20;
    int p,q,r,s;
    p=q=r=s=var;

    }
}
