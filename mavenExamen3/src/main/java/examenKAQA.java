
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laboratorio
 */
public class examenKAQA {
    public int[][] transformada06(int dimen, int NumInit){
          System.out.println("Ejercicio 6: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                  if ( j<i+1){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }   
              }contador=0;
          }
          return matriz;
     } 
    
     public int[][] transformada09(int dimen, int NumInit){
          System.out.println("Ejercicio 9: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
               for (int j = 0; j < matriz.length ; j++) {
                  if (j>=dimen-(i+1)){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
          return matriz;
     }    
     
     public int[][] transformada12(int dimen, int NumInit){
          System.out.println("Ejercicio 12: ");
          int[][] matriz=new int[dimen][dimen];
         int contador=0;
          for (int i = 0; i < matriz.length ; i++) {
              for (int j = matriz[0].length-1; j>=0; j--) {
                  if (j>=i){
                      matriz[i][j] = NumInit;
                      NumInit++;
                      contador++;
                     }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
          return matriz;
     }
    
     public int[][] transfromada26(int dimen, int NumInit){
         System.out.println("Ejercicio 26: ");
         int[][] matriz=new int[dimen][dimen];
          int contador=0;
          for (int i = 0; i< matriz.length ; i ++) {
                if(contador%2==0){
                    for (int j = matriz[0].length-1; j>=0; j--) { 
                    matriz[i][j]=NumInit; 
                    NumInit++;
                    contador++;
         }
         }else{
               for (int j = 0; j< matriz.length ; j ++) {
                matriz[i][j]=NumInit;
                NumInit++;
                contador++;
                }
            } 
            } contador=0;         
    return matriz;
    }
     
     public int[][] transformada30(int dimen, int NumInit){
     System.out.println("Ejercicio 30: ");
        int[][] matriz=new int[dimen][dimen];
        for (int c = 0; c < dimen/2; c++) {
             for (int ldx = c;ldx < dimen-c-1; ldx++) {
                matriz[ldx][dimen-1-c]= NumInit;
                NumInit++;   
            }
             for (int lix = dimen-c-1;lix > c; lix--) {
                matriz[dimen-1-c][lix]= NumInit;
                NumInit++;
            }
           for (int lxx = dimen-c-1;lxx > c; lxx--) {
                matriz[lxx][c]= NumInit;
                NumInit++;  
           }
            for (int lsx = c; lsx < dimen-c-1; lsx++) {
                matriz[c][lsx]= NumInit;
             NumInit++;   
            }
        }
            if(dimen%2!=0){
                matriz[dimen/2][dimen/2]=NumInit;
            }
        
        return matriz;
 }
    public int[][] cuadradosXnum(int numero){
    int[][] tablaM=new int[numero][2];
        for(int i = 0; i < tablaM.length; i++) {
           tablaM[i][0]=i+1;
           tablaM[i][1]=(i+1)*(i+1);           
        }
        return tablaM;
    }    
    public void sumaDeValoresxParesImpar(){
        int[][]  datos={{3,40,70,30},{50,5,20,4},{60,18,6,10},{16,5,9,7}};
        int par=0, impar=0, todos=0;        
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                if(datos[i][j]%2==0){
                    par=par+datos[i][j];
                }else{
                    impar=impar+datos[i][j];
                }
                todos=todos+datos[i][j];
            }
        }
        System.out.println("PAR:"+par);
        System.out.println("impar:"+impar);
        System.out.println("todos:"+todos);
     }

    public int[][] transformada01(int dimensionX, int numInit){
        int[][] matriz=new int[dimensionX][dimensionX];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j<dimensionX-i){
                    matriz[i][j]=numInit+(i+j)*(i+j+1)/2+i;
                }else{
                matriz[i][j]=-1;
                }
            }
        }        
    return matriz;
    }
    public int[][] transformada05(int dimensionX, int numInit){
        int[][] matriz=new int[dimensionX][dimensionX];
        int contador=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[0].length-1; j>=0; j--) {
                if(contador<=i){
                    matriz[i][j]=numInit;
                    numInit++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }        
    return matriz;
    }

    public int[][] trasformada28(int dim, int numInit){
    int cont=0; int[][] matriz=new int[dim][dim];
        for (int x =matriz.length-1; x >=0 ; x--) {
            if(cont%2==0){
                for (int y = 0; y < matriz[0].length; y++) {
                    matriz[x][y]=numInit;
                    numInit++;
                }
            }else{
                for (int y = matriz[0].length-1; y >=0; y--) {
                    matriz[x][y]=numInit;
                    numInit++;
                }
            }
            cont++;
        }    
        return matriz;
    }

    public int[][] trasformada29(int dim, int numInit){
    int[][] matriz=new int[dim][dim];
        for (int c = 0; c < dim/2; c++) {
            for (int lsx = c; lsx < dim-c-1; lsx++) {
                matriz[c][lsx]=numInit;
                numInit++;
            }            
            for (int ldx = c; ldx < dim-c-1; ldx++) {
                matriz[ldx][dim-1-c]=numInit;
                numInit++;                
            }
            for (int lix = dim-c-1; lix > c; lix--) {
                matriz[dim-1-c][lix]=numInit;
                numInit++;                
            }
            for (int lxx = dim-c-1; lxx > c; lxx--) {
                matriz[lxx][c]=numInit;
                numInit++;                
            }

        }

        if(dim%2!=0){
        matriz[dim/2][dim/2]=numInit;
        }

        return matriz;
    }

    public void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }


    public static void main ( String [] args ) {
        examenKAQA ag = new  examenKAQA ();
        int[][] matriX=ag.cuadradosXnum(10);
        for (int[] matriX1 : matriX) {
            System.out.println(matriX1[0] + "|" + matriX1[1]);
        }
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        System.out.println ( " Resultados de Suma de contenido de Matriz " );
        while (opcion!=0) {            
            switch(opcion){
            case 1: ag.imprimirMatriz(ag.transformada06(5, 0)); break;
            case 2: ag.imprimirMatriz(ag.transformada12(5, 0));break;
            case 3: ag.imprimirMatriz(ag.transformada09(5, 0)); break;
            case 4: ag.imprimirMatriz(ag.transformada30(5, 0)); break;
            case 5: ag.imprimirMatriz(ag.transfromada26(5, 0)); break;
            
            default: System.out.println("Opción Inválida!!");break;
            }  
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
        }
    }

    
}