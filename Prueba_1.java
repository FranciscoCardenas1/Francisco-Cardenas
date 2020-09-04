
package prueba_1;

import java.util.Random;
import javax.swing.*;


public class Prueba_1 {

    static public int menu (){
        
     String ops = "";
        int op = 1;
        do {
            try {
                ops = JOptionPane.showInputDialog("Menu principal"
                        + "\n1.- Vectores"
                        + "\n2.- Matrices"
                        + "\n3.- Visualizar informacion"
                        + "\n4.- Salir"
                        + "\n\nElija Opcion:");
                op = Integer.parseInt(ops);
                if (op < 1 || op > 4) {
                    JOptionPane.showMessageDialog(null, "Opcion fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException asd) {
                JOptionPane.showMessageDialog(null, "Error no es un numero de opcion", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } while (op < 1 || op > 4);
        return op;
    }


    public static void main(String[] args) {
        int op;
        do {
            op = menu();
            switch (op) {
                case 1:
                    final int min = 10;
                    final int max = 99;
                    final Random azar = new Random();
                    int[] arreglo1 = new int[10];
                    int arreglo2[] = new int[10];
                    for (int i = 0; i < arreglo1.length; i++) {
                        arreglo1[i] = azar.nextInt(max - min) + min;
                    }

                    for (int i = 0; i < arreglo1.length; i++) {
                        System.out.print(arreglo1[i] + "|");
                    }
                    final int min2 = 100;
                    final int max2 = 150;
                    int[] arreglo3 = new int[10];
                    int arreglo4[] = new int[10];
                    for (int i = 0; i < arreglo3.length; i++) {
                        arreglo1[i] = azar.nextInt(max - min) + min;
                    }

                    for (int i = 0; i < arreglo3.length; i++) {
                        System.out.print(arreglo3[i] + "|");
                    }
                    break;
                case 2:
                    final int min3 = 1;
                    final int max3 = 99;
                  //  final Random azar = new Random();
                    int limite;
                    int matriz[][] = new int[3][3];

                    for (int i = 0; i <= 2; i++) {
                        for (int j = 0; j <= 2; j++) {
                            //matriz[i][j] = azar.nextInt(max3 - min3) + min3;
                        }
                    }

                    limite = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el l�mite para la matriz"));

                    for (int i = 0; i <= 2; i++) {
                        System.out.println("");
                        for (int j = 0; j <= 2; j++) {
                            System.out.print(matriz[i][j] + "|");
                        }
                    }
         
                   
                    break;
                case 3:
                     System.out.println("----------------------------------------------------------");
                     System.out.println("|            Proyecto de POO Desarrollado por:           |");
                     System.out.println("|            Francisco Esteban Cárdenas Orteta           |");
                     System.out.println("|                       Sección 701                      |");
                     System.out.println("|                      04 / 09 / 2020                    |");
                     System.out.println("----------------------------------------------------------");
                     
                     
                   
                    break;
                case 4:
                    
                    break;
                
            }
        } while (op != 4);

    } 
   
    }
