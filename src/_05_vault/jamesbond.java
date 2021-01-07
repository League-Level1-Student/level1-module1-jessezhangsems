package _05_vault;

public class jamesbond {
int findCode(vault d) {
	for(int i=0; i<1000000; i++) {
		if(d.tryCode(i)) {
		return i; 	
		}
		
	
	}
	return -1;
}
}