package _05_vault;

public class VaultRunner {
public static void main(String[] args) {
	vault vault = new vault(10);
	JamesBond james = new JamesBond();
	System.out.println(james.findCode(vault));
}
}
