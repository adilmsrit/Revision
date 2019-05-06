package Collections;

import java.time.LocalTime;

public class TestBox3 {

  public static void main(String[] args) {

    int worldRecord = 10;

    LocalTime raceStartTime = LocalTime.of(8,10,00);
    LocalTime raceEndTime = LocalTime.of(8,10,30);

    if (raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime))
      System.out.println("New World Record");
    else System.out.println("Try Harder");




  }

}
