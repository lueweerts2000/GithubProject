import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        int max = 10;
        Random rand = new Random();
        int randomNum = rand.nextInt(max);
        System.out.println("Generated number: " + randomNum);
    }
}
