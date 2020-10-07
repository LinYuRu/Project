package ch6;

public class ch6_13 {
	public static void main(String[] args) {				
		outerloop: for ( int i = 1; i <= 10; i++ ) {	// ��outerloop�j��аO
			for ( int j = 1; j <= 10; j++ ) {
				System.out.print("*");					// �C�L����
				if ( j >= i ) {
					System.out.println("");				// �U����X����
					continue outerloop;					// �o�@��outerloop�j�餤��
				}
			}		
		}				
	}
} 

