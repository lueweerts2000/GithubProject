import java.util.Random;

class RandomCode {
  public static void main(String[] args) {
    Random rand = new Random();
    int randomNumber = rand.nextInt((10 - 1) + 1) + 1;
    System.out.println("Your random number is: " + randomNumber);
  }
}