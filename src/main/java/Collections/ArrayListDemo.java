package Collections;

import java.util.ArrayList;

public class ArrayListDemo {


  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>(); //By defualt this will hold 10 elements.
    cars.add("bmw");
    cars.add("Honda");
    cars.add("Audi");

    System.out.println("size is " + cars.size()); //size

    for (String car : cars) {
      System.out.println("the item is " + car);
    }


  }


}
