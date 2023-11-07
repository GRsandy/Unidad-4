
package u4practica2;

//Sandy..GR

public class U4Practica2 {

    public static void main(String[] args) {
        char[][] a = new char[3][5];
        char b = 'A';
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
             a[i][j] = b ;
             b++;
             
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
                
            }
            System.out.println();
        }
        
 
    }
    
}