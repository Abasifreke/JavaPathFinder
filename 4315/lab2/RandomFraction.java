import java.util.Random;
 
public class RandomFraction 
{
	public static void run() 
	{
		Random random = new Random(System.currentTimeMillis());
		System.out.println(1 / random.nextInt(1000000));
	}
}