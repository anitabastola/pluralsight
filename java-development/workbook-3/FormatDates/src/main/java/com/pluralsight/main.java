package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = now.format(formatter1);
        System.out.println(formattedDate1);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyy-MM-dd");
        String formattedDate2 = now.format(formatter1);
        System.out.println(formattedDate2);

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        String formattedDate3 = now.format(formatter3);
        System.out.println(formattedDate3);

        Date date = new Date()



        String userInput = "2021-09-05";
        LocalDate birthDay = LocalDate.parse(userInput);

        String formattedDate = birthDay.format(fmt);

        System.out.println("Please enter a date: ");








    }
}
