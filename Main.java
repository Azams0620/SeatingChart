import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Array of integers for seats
    int [] seats = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    // Array of strings for student names
    String [] studentNames = new String[15];
    Scanner scan = new Scanner(System.in);

    // For loop through studentNames Array
    for(int i = 0; i <15; i++){
      System.out.println("Please enter a student name: ");
      studentNames[i] = scan.next();
    }


    System.out.println("The students now have seats, here are the results: \n");
    // While loop to print each name and seat pair
    int counter = 0;
    while(counter < 15){
      //If statement for text formatting
      if(counter % 2 == 0){
        System.out.print(studentNames[counter] + " is in seat number " + seats[counter] + ", ");
        counter++;
      }
      else{
        System.out.println(studentNames[counter] + " is in seat number " + seats[counter] + "\n");
      counter++;
      }
      
       
    }



  }
}