package MatricesDispersas;

public class clsTripleta {
    
//    public static void main(String[] args) {
//        
//    }
//    
//    public static int Formas(){
//        
//    }
//    
//    public static int Menu1(){
//        
//    }
//    
//    public static int Menu2(){
//        
//    }
    
    public int[] MayorImparFila(int[][] tripleta){ //recibe la tripleta
        
        int[] vecF = new int[tripleta[0][2]]; //crea un vector auxiliar del tamaño del numero de filas
                                              //por fdefecto se inicializa en '0'
  
        boolean[] fTieneImpar = new boolean[tripleta[0][0]]; //crea otro vecotr auxiliar del tamaño del numero de fila
                                                             //este vector verifica si el valor en la fila sea impar
                                                             //por defecto se inicializa en 'false'
        
        for(int k=1; k<=tripleta[0][2]; k++){ //se recorre la tripleta
        
            if(tripleta[k][2]%2 != 0){ //se verifica que que el dato sea impar
            
                if(!fTieneImpar[tripleta[k][0]]){ //Valida que vecF tenga algun valor impar
                                                  //!false -> true
                                                  //el vector no tiene un vecF no tiene un impar
                    vecF[tripleta[k][0]] = tripleta[k][2]; //Agrega el valor encontrado
                    fTieneImpar[tripleta[k][0]] = true; //cambiar el vector booleano ya que en esa pos hay un valor impar
                
                } else { //si ya hay un valor en vecF solo es comparar si es mayor  

                    if (tripleta[k][2] > vecF[tripleta[k][0]]) { 
                        vecF[tripleta[k][0]] = tripleta[k][2];
                    }
                
                }
            
            }
        
        }
        return vecF;
    }
    
    public void MayorPromColumna(int[][] tripleta){
        
        int mayor; //variable para almacenar el promedio mayor entre todas las columnas
        
        int[] vecC = new int[tripleta[0][1]]; //para almacenar la suma de los datos de cada columna
        int[] contDatosC = new int[tripleta[0][1]]; //para almacenar el numero de datos que hay en cada columna
        
        for(int k=1; k<=tripleta[0][2]; k++){  //se recorre la tripleta
            
            vecC[tripleta[k][1]] += tripleta[k][2]; //se suman los datos de cada columna
            contDatosC[tripleta[k][1]]++; // su suman el numero de datos de cada columna
            
        }
        
        for(int i=0; i<tripleta[0][1]; i++){ //se recorre vecC
            
            vecC[i] = vecC[i] / contDatosC[i]; //se obtiene el promedio y se reutiliza vecC
            
        }
        
        mayor = vecC[0]; //se inicializa vecC con el primer promedio
        for(int j=1; j<tripleta[0][1]; j++){ //se recorre vecC
            if(vecC[j] > mayor){ //Se compara el resto de datos para encontrar el mayor promedio
                mayor = vecC[j]; //ese mayor promedio se almacena en mayor
            }
        }
        
        //--------mostrar mayor
        
    }
    
    public void sumaDiagonalPrincipal(int[][] tripleta){
        
        int sumaD = 0; //Se inicializa la suma de la diagonal principal
        
        for(int k=1; k<=tripleta[0][2]; k++){ //se recorre la tripleta
            
            if(tripleta[k][0] == tripleta[k][1]){ //si fila = columna
                sumaD += tripleta[k][2]; //se suma el dato con la sumaD
            }
            
        }
        
        //-------- mostrar sumaD
        
    }
    
    public void sumaDiagonalSecundaria(int[][] tripleta){
        
    }
    
    
    
    
}
