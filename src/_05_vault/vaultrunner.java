package _05_vault;

public class vaultrunner {
public static void main(String args[]) {
	vault vault=new vault(1000);
	System.out.println(vault.tryCode(1000));
	
	jamesbond jamesbond=new jamesbond();
	System.out.println(jamesbond.findCode(vault));
}
}
