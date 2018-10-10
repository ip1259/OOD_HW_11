import java.text.DecimalFormat;
import java.util.Scanner;

public class HW1_Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise exercise[] = new Exercise[3] ;
		Exercise total = null;
		Scanner kb = new Scanner(System.in);
		
		for(int i = 0;i<3;i++)
		{
			try
			{
				System.out.println("Name of exercise " + (i+1) + ":");
				exercise[i] = new Exercise();
				exercise[i].setName(kb.nextLine());
				System.out.println("Score received for exercise " + (i+1) + ":");
				exercise[i].setScoreReceived(Integer.valueOf(kb.nextLine()));
				System.out.println("Total points possible for exercise " + (i+1) + ":");
				exercise[i].setTotalPoint(Integer.valueOf(kb.nextLine()));
				System.out.println("");
				if(exercise[i].getTotalPoint() < exercise[i].getScoreReceived())
				{
					System.out.println("total point must bigger than Score_received!!");
					i--;
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("Score received and Total Points only allow integer!");
				i--;
			}
		}
		int tempTotal = 0;
		int tempScore = 0;
		for(Exercise e : exercise)
		{
			tempTotal = tempTotal + e.getTotalPoint();
			tempScore = tempScore + e.getScoreReceived();
		}
		total = new Exercise("Total",tempScore,tempTotal);
		
		DecimalFormat df = new DecimalFormat("#,##0.00%");
		
		System.out.printf("%-30s%-10s%s\n","Exercise","Score","Total Possible");
		for(Exercise e : exercise)
		{
			System.out.println(e.toString());
		}
		System.out.println(total.toString());
		System.out.println("");
		System.out.println("Your total is " + total.getScoreReceived() + " out of " + total.getTotalPoint() + ", or " + df.format((double)total.getScoreReceived()/total.getTotalPoint()) + ".");
		kb.close();

	}

}
