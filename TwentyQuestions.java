import java.util.Scanner;

class TwentyQuestions {
  public static void main(String[] args) {
    talkToUser();
  }

  public static void talkToUser() {
    Scanner scan = new Scanner(System.in);
    int secretNumber = 42;
    int guess = -1;
    while(guess != secretNumber) {
      System.out.print("Give me a number: ");
      guess = scan.nextInt();
      //Stop telling me I'm wrong if I'm right.
      //Fix this so it only says you are wrong if you are wrong.
      System.out.println("You said: " + guess);
      if (guess <= secretNumber){
        System.out.println("You guessed too low!");
      }
      if(guess >= secretNumber){
            System.our.println("You guessed too high!");
      }
      if(guess == secretNumber){
        System.out.println("You were right!");
      }


      }

      //Give some hints. The user gets feedback.
    }

  }
}
