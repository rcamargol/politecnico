
public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] m = new int[3][3];
		int filas,cols;
		
		m[0][0] = 3;
		m[0][1] = 5;
		m[0][2] = 1;
		
		m[1][0] = 0;
		m[1][1] = 0;
		m[1][2] = 4;
		
		m[2][0] = 1;
		m[2][1] = 8;
		m[2][2] = 3;
		
		for(filas = 0 ; filas < 3 ; filas++) {
			for (cols = 0 ; cols < 3 ; cols++) {
				//System.out.print(m[filas][cols]+" ");
				//System.out.print(m[cols][filas]+" ");
				if (filas == cols) {
					m[filas][cols] = filas+1;
				}
				else {
					m[filas][cols] = 0;
				}
				System.out.print(m[filas][cols]+" ");
			}
			System.out.println();
		}
		
		for (filas = 0; filas < 3 ; filas++) {
			for (cols = 0; cols < 3 ; cols++) {
				if(m[filas][cols] == 2) {
					System.out.println("El 2 está en fila:"+filas+" Col:"+cols);
				}
			}
		}
		
		filas = 0;
		while (filas < 3) {
			cols = 0;
			while (cols < 3) {
				m[filas][cols] = -1;
				System.out.print(m[filas][cols]+" * ");
				cols++;
			}
			System.out.println("");
			filas++;
		}
	}

}
