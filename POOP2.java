/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop2;

/**
 *
 * @author nikte
 */
public class POOP2 {

    public static void main(String[] args) {
        //
        int a= 55; int b = 36;
        System.out.println("a = "+a);
        System.out.println("b ="+b);
        
        /********************* if **********/
        if (a<b){
            System.out.println("a < b");
        }else{
            System.out.println("a >= b");
        }
        /********************* if **********/
        
        if (a<b)
            System.out.println("a < b");
        else
            System.out.println("a >= b");
        /********************* if método **********/
        
        if (f(a,b))
            System.out.println("f regresa true");
        else
            System.out.println("f regresa false");
         /********************* if- if else **********/
        
        if (a<b)
            System.out.println("a < b");
        else if(a<=b)
            System.out.println("a <= b");
        else
            System.out.println("a > b");
         /**************** switch ****************/
        KeyboardInput teclado = new KeyboardInput();
        System.out.println("Escriba un numero entre 1 y 7");
      //int dia = teclado.readInteger();
        int dia = 2;
        switch (dia){
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("El numero no es un dia de la semana");
                break;
            
        }
    /************************* for ***************************/
        int [] x = new int[15];//arreglo x de 15 posiciones
        int var = 15;
        for (int i = 0; i < 15; i++){
            x[i] = i;
        }
        for (int i = 0; i < 15; i++){
            System.out.println(x[i]);
        }
        
        for (int i = 0; i < var; i++)
            System.out.println("Hola");
        System.out.println("Otro Hola");  
     /************* while **************/
        int i = 0;
        while (i < var){
            System.out.println("Contando hacia arriba: "+ i);
            i ++;
            //i += 1;  
        }
        while (i > 0){
            System.out.println("Contando hacia abajo: " + i);
            //i -= 1
            i--;
        }
        System.out.println(i);
     /********************** do-while ***********************/        
        do {
            System.out.println("Contando hacia abajo " +i);
            i--;
        }while(i>0);
        System.out.println(i);
    /********************** continue ***********************/ 
        int s = 5;
        String k = "6";
        int z = 5 + Integer.parseInt(k);
        
        System.out.println("Z es igual a "+z);
        
        for (int j = 0; j < 18; j++){
            System.out.println("Escoja un número: ");
            float numero = teclado.readFloat();
            if (numero == 0){
                System.out.println("Divison entre 0");
                continue;
                //break;
            }
            System.out.println("100/"+ numero + " = " + 100.0/numero);
        }
        System.out.println("Bandera5");
    }
        public static boolean f(int x, int y){
            return (x<y);
        }
    
    
}

