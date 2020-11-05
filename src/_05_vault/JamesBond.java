package _05_vault;

public class JamesBond {

	
	
	
public int	findCode(vault code) {
	for (int i = 0; i < 1000001; i++) {
		
		if(code.tryCode(i)) {
			return i;
		}
		
	}
	return -1;
}
}
