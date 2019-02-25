package edu.dmacc.codedsm.hw6;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class StringCombiner {
    public static void main(String[] args) {
        String firstname = "patrick";
        String lastname = "karemera";
        String fullname = getFullname(firstname,lastname);
        System.out.println(fullname);

        String todaysDate = outputDate();
        System.out.println(todaysDate);

        String nameDate = getFullname(fullname,todaysDate);
        System.out.println(nameDate);





    }

    public static String getFullname(String stringFirstname ,String stringLastname){

        return stringFirstname +" "+ stringLastname;


    }

    public static String outputDate(){

        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
        return format.format(Date.from(Instant.now()));
    }



}
