import java.lang.ref.SoftReference;

public class EmpolyeeInfo {
    public static void main(String[] args) {
        String fullName = "John Daniel";
        char gender = 'M';
        Byte age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120000.50;
        System.out.println("Employee fullname is: " + fullName);
        System.out.println(fullName + "' gender is: " + gender);
        System.out.println(fullName + "' age is: " + age + " years old");
        System.out.println(fullName + " works at: " + companyName);
        System.out.println(fullName + "' Job title is: " + jobTitle);
        System.out.println(fullName + "' salary is: " + salary + " $");
        System.out.println(fullName + " is full time employee: " + isFullTime);
        System.out.println(fullName + " is married: " + isMarried);


    }


}
