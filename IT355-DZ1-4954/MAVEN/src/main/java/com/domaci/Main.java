package com.domaci;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       EmailSender.getInstance().sendEmail("d.milovanovic@gmail.com",
               "Pozdrav sa kompa!", "Postovani, u prilogu Vam saljem ljubav!<3 ");
       ExcelReader.readStudentsData("C:\\Users\\User\\Downloads\\MET\\6 semestar\\IT355-VEB SISTEMI\\DZ\\dz1\\IT355-DZ1-4954\\students.xlsx");
    }
}