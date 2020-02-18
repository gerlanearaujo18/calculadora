
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Infome as quatro notas : ");
		double p1=sc.nextDouble();
		double p2=sc.nextDouble();
		double p3=sc.nextDouble();
		double p4=sc.nextDouble();

		double n1 = (p1 + p2)/2;
		double n2 = (p3 + p4)/2;
		double NS = (n1 + n2)/2;
		
		if(NS >= 7) {
			System.out.println("Aprovado!");
		} else {
			if (NS  > 4) {
				System.out.println("Prova final!");
				double pf = sc.nextDouble();
				double nf = (NS + pf)/2;
			}
		}
		System.out.println("infome  a nota da prova final!");
		if ( NS  > 5 ) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado!");
		}
				
		
	}

}
