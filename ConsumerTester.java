import java.util.Scanner;

/**
 * Write a description of class ConsumerTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
