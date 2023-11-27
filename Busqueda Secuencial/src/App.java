import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean band = false;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numeor a buscar: "));

        //Busqueda secuencial
        int i = 0;
        while(i<5 && band == false){
            if(arreglo[i] == dato){
                band = true;
            }
            i++;
        }

        if(band == false){
            JOptionPane.showMessageDialog(null,"Nos se ha encontrado el numero a buscsar");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en la posicion: " +(i -1));
        }

    }
}
