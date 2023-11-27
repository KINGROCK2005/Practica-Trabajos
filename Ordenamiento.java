import java.util.Scanner;

import javax.swing.JOptionPane;
public class Ordenamiento {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int arreglo[],nElementos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos"));
        arreglo = new int[nElementos];

        for (int i= 0; i <nElementos; i++){
            System.out.print((i+1) + ". Digite un numero: ");
            arreglo[i]= entrada.nextInt();
        }

        //Metodo burbuja
        for(int i = 0; i <(nElementos-1); i++){
            for(int k=0; k < (nElementos-1); k++){
                if(arreglo[k] > arreglo[k +1]){//si numero actual es mayor al siguiente
                    aux = arreglo[k];
                    arreglo[k] = arreglo[k + 1];
                    arreglo[k+1] = aux;
                }
            }
        }

        System.out.println("\nArreglo de forma ascendente");
        for(int i = 0; i<nElementos;i++){
            System.out.print(arreglo[i] +" - ");
        }

        System.out.print("\nArreglo de forma decreciente");
        for(int i =(nElementos-1);i >0; i--){
            System.out.println(arreglo[i] + " - ");
        }
        
    }
}
