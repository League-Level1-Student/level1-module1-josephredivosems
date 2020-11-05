package _06_duck;

public class Wolf {

	String howl;
	int kills;
	
	public void run() {
		System.out.println("The wolf is running.");
	}
	public void kill() {
		System.out.println("The wolf has killed his prey");
	}
	Wolf(int kills, String howl){
		this.kills = kills;
		this.howl = howl;
	}
}
