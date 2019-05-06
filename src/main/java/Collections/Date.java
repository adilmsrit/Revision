package Collections;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

  private static final LocalDateTime dateNow = LocalDateTime.now();

  public static void main(String[] args) {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH-mm-ss");

    String dates = dateNow.format(dateTimeFormatter);
    System.out.println(dates);

  }
}
