import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        String[] question={ "What is Automation Testing?",
                            "What is a 'Test Suite' in the context of Automation Testing?",
                            "What is the role of 'Test Data' in Automation Testing?",
                            "What is 'Cross-Browser Testing' in Automation Testing?",
                            "What is the purpose of 'TestNG' in Automation Testing?"};

        String[][] options = {
                                {"1. Testing performed by humans manually", "2. Testing performed using automated scripts", "3. Testing performed only on mobile devices","4. Testing performed on the cloud"},
                                {"1. A single test case", "2. A collection of test cases", "3. A programming language","4. A tool for executing test scripts"},
                                {"1. To execute test cases manually", "2. To record and playback test scripts", "3. To provide input values for test cases" ,"4. To generate test reports"},
                                {"1. Testing performed across different programming languages", "2. Testing the same application on multiple browsers", "3. Testing mobile applications only", "4. Testing using multiple test scripts"},
                                {"1. A programming language", "2. A tool for test execution", "3. A testing framework for Java","4. A type of browser automation"},};

        int[] answer = {2, 2, 3, 2, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("**********************");
        System.out.println(" Welcome to Quiz Game ");
        System.out.println("**********************");

        for (int i=0;i<question.length;i++){
            System.out.println(question[i]);

            for(String option:options[i]){
                System.out.println(option);
            }
            System.out.println("**********************");
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answer[i]){
                System.out.println("**********");
                System.out.println(" CORRECT ");
                System.out.println("**********");
                score++;
            }
            else {
                System.out.println("**********");
                System.out.println("  WRONG  ");
                System.out.println("**********");
            }
        }

        System.out.println("Your final score is "+score+" out of " +question.length);
    }
}
