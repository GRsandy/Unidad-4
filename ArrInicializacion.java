
package arrinicializacion;


public class ArrInicializacion {

   
    public static void main(String[] args) {
          String [][] nombres = {
        { "paola","jesica", "jesus"},
        {"pablo","karla","ismael"},
        {"fanny","alex","samuel"}
       
};
          for (int i = 0; i < nombres.length; i++) {
              for (int j = 0; j < nombres[i].length; j++) {
                  System.out.print(nombres[i][j] + " ");
              }
              System.out.println(" ");
        }
     
    }
    
}
