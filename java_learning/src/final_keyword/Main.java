package final_keyword;

class Student {

    // breif about final variables
    public static final String schoolName = "MRR";
    private String studentName;
    private String address;

    public Student(String studentName, String address) {
        this.studentName = studentName;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Student Name: "+this.studentName);
        System.out.println("Student Address: "+this.address);
        System.out.println("School Name: "+Student.schoolName);
    }
}

class Payment {
    // TODO: Final method
    public final void description() {
        System.out.println("Payment Description");
    }
    public void pay() {
        System.out.println("Pay");
    }
}

class UpiPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("UPI Payment");
    }

    // TODO: Error final methods can't override
    // @Override
    // public void description() {
    //     System.out.println("Hello");
    // }
}

class CrediCardPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("CreditCard Payment");
    }
}

// TODO: Final class
final class Employee {
    public void display() {
        System.out.println("Employee");
    }
}

// TODO: Final class can't override
// class BankEmployee extends Employee {

// }


public class Main {

    public static void main(String[] args) {
        // Student student = new Student("Ganesh", "CHennai");
        // student.displayDetails();

        Payment upiPayment = new UpiPayment();
        upiPayment.description();
        upiPayment.pay();

        Payment cardPayment = new CrediCardPayment();
        cardPayment.description();
        cardPayment.pay();


    }
}
