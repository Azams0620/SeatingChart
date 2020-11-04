import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Array of integers for seats
    int [] seats = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    // Array of strings for student names
    String [] studentNames = new String[15];

    // For loop through studentNames Array
    for(int i = 0; i <15; i++){
      System.out.println("Please enter a student name: ");
      Scanner scan = new Scanner(System.in);
      String name = scan.next();
      studentNames[i] = name;
      System.out.print("Cool! " + name + " is in seat number " + seats[i] + "\n");
    }



  }
}