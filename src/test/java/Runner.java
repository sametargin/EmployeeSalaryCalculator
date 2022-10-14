import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("İsim Giriniz");
        Scanner scName = new Scanner(System.in);
        String nameInput = scName.nextLine();

        System.out.println("Maaşı Giriniz");
        Scanner scSalary = new Scanner(System.in);
        double salaryInput = scSalary.nextDouble();

        System.out.println("Haftalık Çalışma Saatini Giriniz");
        Scanner scWorkHours = new Scanner(System.in);
        int workHoursInput = scWorkHours.nextInt();

        System.out.println("İşe Giriş Yılını Giriniz");
        Scanner scHireYear = new Scanner(System.in);
        int hireYearInput = scHireYear.nextInt();

        Employee employee=new Employee(nameInput,salaryInput,workHoursInput,hireYearInput);
    }
}
