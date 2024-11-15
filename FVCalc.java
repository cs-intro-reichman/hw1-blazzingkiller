public class FVCalc {
	public static void main(String[] args){
	int currentValue = Integer.parseInt(args[0]); 
	double irate = Double.parseDouble(args[1]);
	int n = Integer.parseInt(args[2]); 
	double rate = (irate/100);
	double futureValue = (currentValue * (Math.pow((1 + rate),n )));
	System.out.println("After " + n + " years, a $" + currentValue + " saved at " + irate + "% will yield $" + ((int) futureValue));
	}
}
