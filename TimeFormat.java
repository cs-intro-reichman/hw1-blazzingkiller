public class TimeFormat {

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        String period = (hours >= 12) ? " PM" : " AM";
        int displayHour = (hours % 12 == 0) ? 12 : hours % 12;
	String formattedMinutes = (minutes < 10) ? "0" + minutes : String.valueOf(minutes);

        System.out.println( displayHour + ":" + formattedMinutes + period);
    }
}