package _05_vault;

public class vault {
int secretcode;
vault(int num){
	secretcode=num;
	
}
boolean tryCode(int num){
	return num==secretcode;
}
}
