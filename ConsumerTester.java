import java.util.Scanner;

/**
 * Maddy Ting
 * Takes file name input from user and outputs both a fake randomized review and a purposefully positive or negative review
 */
public class ConsumerTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter file name to create fake reviews: ");
        String fileName = in.nextLine();

        System.out.println("Fake review: ");
        System.out.println(Review.fakeReview(fileName));

        System.out.println("Slanted fake review: ");
        System.out.println(Review.slantReview(fileName));

    }
}
