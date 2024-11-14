public class TimeFormat {
	public static void main(String[] args) {

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
    
        int displayHour = hours;
        if (hours == 0) {
            displayHour = 00; 
        } else {
            displayHour = (hours == 12) ? 12 : hours % 12;
        }
        String period = (hours >= 12) ? " PM" : " AM";
	    String formattedMinutes = (minutes < 10) ? "0" + minutes : String.valueOf(minutes);

        System.out.println( displayHour + ":" + formattedMinutes + period);
    }
}
