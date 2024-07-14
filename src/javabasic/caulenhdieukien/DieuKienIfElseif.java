package javabasic.caulenhdieukien;
import java.util.Scanner;
public class DieuKienIfElseif {
    String getResult(double DTB){
        if(DTB>=8){
            //System.out.println("Giỏi");
            return "Giỏi";
        }
        else if(DTB>=6.5 && DTB< 8){
            //System.out.println("Khá");
            return "Khá";
        }
        else if(DTB>=5 && DTB< 6.5){
            // System.out.println("Trung bình");
            return "Trung bình";
        }
        else{
            // System.out.println("Kém");
            return "Kém";
        }
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double DTB = input.nextDouble();
        DieuKienIfElseif obj = new DieuKienIfElseif();

        String result = obj.getResult(DTB);
        System.out.println(result);

        input.close();

    }
}
