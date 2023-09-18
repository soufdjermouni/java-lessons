package com.version.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateRepresentation {

    public static void main(String[] args) throws ParseException {

        //Getting current time
        Date now = new Date();  //Old
        System.out.println(now);//Wed Sep 13 11:07:36 CEST 2023
        ZonedDateTime nownew = ZonedDateTime.now(); //new
        System.out.println(nownew);//2023-09-13T11:07:36.638055200+02:00[Europe/Paris]

        //Time zone conversion
        // Old
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeZone(TimeZone.getTimeZone("CET"));
        Date centralEastern = calendar.getTime();
        System.out.println(centralEastern);//Wed Sep 13 11:07:36 CEST 2023
        // New
        ZonedDateTime centralEasternNew = LocalDateTime.now().atZone(ZoneId.of("CET"));
        System.out.println(centralEasternNew);//2023-09-13T11:07:36.650366800+02:00[CET]

        //Time formatting and parsing  :DateTimeFormatter is a replacement for the old SimpleDateFormat that is
        // thread-safe and provides additional functionality.
        // Old
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date now1 = new Date();
        String formattedDate = dateFormat.format(now1);
        Date parsedDate = dateFormat.parse(formattedDate);
        System.out.println("parsedDate="+parsedDate);

        // New
        LocalDate now2 = LocalDate.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = now2.format(formatter2);
        LocalDate parsedDate2 = LocalDate.parse(formattedDate2, formatter2);
        System.out.println("parsedDate2="+parsedDate2);//2023-09-13
    }
}
