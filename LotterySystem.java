

	import java.util.Random;
	import java.util.Scanner;
	import java.util.Set;
	import java.util.TreeSet;

	public class LotterySystem {
	    public static final int NUMBERS = 6;
	    public static final int MAX_NUMBER = 40;
	    public static final int PRIZE = 100;
	    public static void main(String[] args) {
//	        getting winning number and ticket
	        Set<Integer> winning = createWinningNumber();
	        Set<Integer> ticket = getTicket();

	        Set<Integer> matches = new TreeSet<>(ticket);
	        matches.retainAll(winning);

//	        Calculating the prize
	        System.out.println("Your Ticket Was:"+ ticket);
	        System.out.println("Winning Numbers:"+ matches);

	        if(matches.size() > 0){
	            double prize = PRIZE * matches.size();
	            System.out.println("Matched Number"+matches);
	            System.out.println("Your Prize is:" + prize);
	        }
	    }


//	    generate a set of the winning lottery number

	    public static Set<Integer> createWinningNumber(){
	        Set<Integer> winning = new TreeSet<>();
	        Random random = new Random();
	        while (winning.size() < NUMBERS){
	            int number = random.nextInt(MAX_NUMBER) + 1;
	            winning.add(number);

	        }
	        return winning;

	    }


//	    Reading the players ticket form the console

	    public static Set<Integer> getTicket(){
	        Set<Integer> ticket = new TreeSet<>();
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Entre"+ NUMBERS + " Lottery Number");

	        while (ticket.size() < NUMBERS){
	            int number = scanner.nextInt();
	            if(number <= MAX_NUMBER)
	            ticket.add(number);
	        }
	        return ticket;
	    }


	}


