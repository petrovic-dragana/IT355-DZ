package com.domaci;
public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = EmailSender.getInstance();
        emailSender.sendEmail("primer@gmail.com", "Test email", "Ovo je testna poruka.");
        
        StudentDataReader reader = new StudentDataReader();
        reader.readStudentsData("C:\\Users\\User\\Downloads\\MET\\6 semestar\\IT355-VEB SISTEMI\\DZ\\dz1\\IT355-DZ1-4954\\students.xlsx");
    }
}