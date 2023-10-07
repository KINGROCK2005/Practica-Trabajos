import java.util.Scanner;
public class salarioNeto {
public static Scanner lector = new Scanner(System.in);
static double salBruto, ingTot, ing_antiguedad, monAfili, inss, ir, inssPatr, salNeto;
    public static void main(String []args){

        
        // totDeducciones(salBr);
        Ingresos();

        totDeducciones();

        System.out.println("Su salariom por antiguedad es: " + ing_antiguedad);
        System.out.println("Su ingreso total es: " + ingTot);
        System.out.println("Su monto de Ailiciacion es: " + monAfili);
        System.out.println("El IR es: " + ir);
        System.out.println("El INSS es: " + inss);
        System.out.println("El INSS Patronal es: " + inssPatr);
        System.out.println("Su salario neto es: " + salNeto);
    }

    public static void Ingresos(){
        System.out.println("Ingrese su salario Bruto: ");
         float salBruto  = lector.nextFloat();
         ing_antiguedad = (0.15F * salBruto );

    }
    public static void totDeducciones(){
        ingTot= ing_antiguedad + salBruto;
         monAfili = ingTot * 0.01F;
         inss = ingTot * 0.07F;
         ir = ingTot * 0.156F;
         inssPatr = ingTot * 0.225F;
        salNeto = ingTot - (monAfili + inss + ir);
    }
    
}
