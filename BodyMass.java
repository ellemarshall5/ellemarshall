import java.util.*;  //imports entire java util library

public class BodyMass {
    public static void main(String[] args) {
        double height = 0.0; //initializes double
        double weight = 0.0; //initializes double
        double bmi; //declares double
        boolean error = false; //initializes boolean

        Scanner in = new Scanner(System.in); //creates new instance of scanner

        System.out.println("Please enter your height in inches."); //asks for user input

        //loop to test user input for valid data
        do {
            try {
                error = false;
                height = in.nextDouble(); //reads user input

                if (height < 0){
                    System.out.println("Please re-enter a positive number. "); //asks for valid data
                    height = in.nextDouble();  //reads user input
                }
            } catch (InputMismatchException e) {  //catches invalid input
                error = true;
                System.out.println("Sorry that was not valid input."); //output
                System.out.println("Please re-enter your height in numerical form"); //asks for valid user input
                in.nextLine(); //flushes the buffer
            }
        } while (error);

        System.out.println("Please enter your weight in pounds."); //asks for user input

        //loop to test user input for valid data
        do {
            try {
                error = false;
                weight = in.nextDouble(); //reads user input

                if (weight < 0.0) {
                    System.out.println("Please re-enter a positive number."); //asks for valid input
                    weight = in.nextDouble(); //reads user input
                }
            } catch (InputMismatchException e) {   //catches invalid data
                error = true;
                System.out.println("Sorry that was not valid input."); //output
                System.out.println("Please re-enter your weight in numerical form"); //asks for valid data
                in.nextLine(); //flushes the buffer
            }
        }while(error);

        bmi = (704 * weight) / (height * height); //calculates bmi

        System.out.println("Your height is " + height + "\"" ); //output
        System.out.println("Your weight is " + weight + "lbs"); //output
        System.out.printf("Your Body Mass Index is %.2f\n", bmi); //output

        //decides which output to use based off bmi calculation
        if (bmi >= 19 && bmi <= 25){
            System.out.println("Your BMI is considered normal.");
        }
        else if(bmi <= 19){
            System.out.println("Your BMI is low.");
        }
        else{
            System.out.println("Your BMI is high.");
        }
    }
}

