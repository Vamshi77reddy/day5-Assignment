package day5;

public class CoinFlip {
		public static void main(String[] args) {
			int head=0,tail=0;
			for (int i=1;i<=10;i++) {
				String coin="";
			if (Math.random()<0.5)
				head++;
			else
				tail++;
				
		}
			System.out.println("Head percentage:" +head%10);
			System.out.println("Tail percentage:" +tail%10);
		}}


