package Q2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter patient name:");
        String name=in.nextLine();
        
        System.out.println("Enter account number:");
        int accno =in.nextInt();
        
        Patient  P1=new Patient (name,accno);
       
        System.out.println("Available doctors:");
        
        String arry[]={"1.Dr. Saman - Specialization: [Cardiology]",
                       "2.Dr. Nimal - Specialization: [Neurology]",
                       "3.Dr. Ravi - Specialization: [Pediatrics]",
                       "4.Dr.Mohomad - Specialization: [Dermatology]",
                       "5.Dr. Kumari - Specialization: [Obstetrics & Gynecology]"};
        
        System.out.println("Select a doctor by number:");
        int number =in.nextInt();
        
        String name1[] = {"1.Dr. Saman","2.Dr. Nimal","3.Dr. Ravi ","4.Dr.Mohomad ","5.Dr. Kumari"};
        String Specialization[] ={"Cardiology","Neurology","Pediatrics","Dermatology","Obstetrics & Gynecology"};
        
       Doctor D1=new Doctor(name1[number-1],Specialization[number-1]);
        D1.getName1();
   
        System.out.println("Available time slots for" +name1[number-1]);
        
        System.out.println("1. 2024-03-31 09:00\n" +
                           "2. 2024-03-31 09:30\n" +
                           "3. 2024-03-31 10:00\n" +
                           "4. 2024-03-31 10:30\n" +
                           "5. 2024-03-31 11:00");
        
        System.out.println("Select a time slot by number:");
        int time =in.nextInt();
        
        String T4[]={"1. 2024-03-31 09:00","2. 2024-03-31 09:30","3. 2024-03-31 10:00","4. 2024-03-31 10:30","5. 2024-03-31 11:00"};
         Appointment T1=new Appointment(T4[time-1]);
         
         System.out.printf("Appointment booked for %s with %s at %s\n\n",P1.getName(),D1.getName1(),T1.getT1());
        
        
        
    }
}
