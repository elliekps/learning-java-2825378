import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What is 10 + 10?";
        String choiceOne = "100";
        String choiceTwo = "20";
        String choiceThree = "1";

        String correctAnswer = choiceTwo;
        
        System.out.println(question);
        System.out.println(choiceOne + "or" + choiceTwo + "or" + choiceThree + "?");
        
        Scanner input = new Scanner(System.in);
        Answer = input.nextString();

        if (correctAnswer = choiceTwo) {
            System.out.println("Congratulations! You've got the correct answer.);
        } else {
           System.out.println("That is incorrect, the correct answer is 20.);
        }
    }
              
        // Write a print statement asking the question
        // Write a print statement giving the answer choices

        // Have the user input an answer
        // Retrieve the user's input

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
