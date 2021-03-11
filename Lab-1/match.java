import java.io.*;

class play
{
	int id;
	String name;
	int score1,score2,score3;
	int matches_played;

	play(int id1,String name1,int score11,int score22,int score33,int matches_played1)
	{
		this.id=id1;
		this.name=name1;
		this.score1=score11;
		this.score2=score22;
		this.score3=score33;
		this.matches_played=matches_played1;
	}

	int calculate_avg(int score1,int score2,int score3)
	{
		int avg;
		avg=(score1+score2+score3)/3;
		return avg;
	}
}

class match
{
	public static void main(String args[])
	{
		play p1=new play(1,"Anupama",15,25,78,3);
		play p2=new play(2,"Swathi",26,20,68,3);
		int avg1=p1.calculate_avg(p1.score1,p1.score2,p1.score3);
		int avg2=p2.calculate_avg(p2.score1,p2.score2,p2.score3);
		if(avg1>avg2)
		{
			System.out.println("Avg of "+p1.name+ " is greater");
			System.out.println("Details are:");
			System.out.println("id is :"+p1.id);
			System.out.println("Name is :"+p1.name);
			System.out.println("Number of matche played :"+p1.matches_played);
			System.out.println("Avg score is :"+avg1);
		}
		else
		{
			System.out.println("Avg of "+p2.name+ " is greater");
			System.out.println("Details are:");
			System.out.println("id is :"+p2.id);
			System.out.println("Name is :"+p2.name);
			System.out.println("Number of matche played :"+p2.matches_played);
			System.out.println("Avg score is :"+avg2);
		}
		
	}
}
		
	