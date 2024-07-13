package javabasic.phuongthuc;

public class Company {

    public static String COMPANY_NAME = "Viettel";
    public static String ADDRESS = "Hà Nội";
    public static String PHONE = "123456";
    public static String EMAIL = "viettel@gmail.com";

    public static void getInfoCompany() {
        System.out.println("Company Name: "+ COMPANY_NAME);
        System.out.println("ADDRESS: "+ ADDRESS);
        System.out.println("PHONE: "+ PHONE);
        System.out.println("EMAIL: "+ EMAIL);
    }

    public static String getCompanyName(){
        return COMPANY_NAME;
    }

    public static String getEmail(){
        return EMAIL;
    }

}
