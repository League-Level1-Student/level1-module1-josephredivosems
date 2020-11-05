package _05_vault;

import java.util.Random;

public class vault {
	
int secretCode = 10;
vault(int code){
	secretCode = code;
}


public boolean tryCode(int attempt) {
	if(attempt == secretCode) {
		return true;
	}
	else {
		return false;
	}
}
}