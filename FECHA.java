/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Miguel
 */
public class FECHA {

    /**
     * @param args the command line arguments
     */

        // TODO code application logic here
        public static void main(String[] args)throws IOException {
        // TODO code application logic here

        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        int dia,mes,año,año1,semana,x,añobici,y,z,total,u,j;

        System.out.print("Dame El Dia: ");
        dia=Integer.parseInt(br.readLine());
        System.out.print("Dame El Mes (En Numero): ");
        mes=Integer.parseInt(br.readLine());
        System.out.print("Dame El Año: ");
        año=Integer.parseInt(br.readLine());

        semana=0;
        {

        if((año / 100)%4 == 1)  x = semana + 5;
            else if ((año/100)%4==2)  x= semana+3;
                   else if ((año/100)%4==3) x = semana+1;
                          else if ((año/100)%4==0) x = semana+0;
                                
        else x=0;
         j=0;
            z = 0;
        año1=(año%100)+((año%100)/4);
        y=0;

                if (año % 400 == 0 && año % 100 != 0 && año % 4 == 0)
            if (mes==1 || mes==2) j=z-1;
                else j=z+0;

             if (mes == 8)u = y + 1;
        else if(mes == 2 || mes == 3 || mes == 11) u = y + 2;
        else if(mes == 6) u = y + 3;
        else if(mes == 9 || mes == 12 ) u = y + 4;
        else if(mes == 4 || mes == 7 ) u = y + 5;
        else if(mes == 1 || mes == 10 ) u = y + 6;
        else u = y + 0;

        total=x+y+z+año1+u+dia+j;

        if (total%7==1) System.out.print("Lunes");
            else if(total % 7 == 2) System.out.print("Martes");
            else if(total % 7 == 3) System.out.print("Miercoles");
            else if(total % 7 == 4) System.out.print("Jueves");
            else if(total % 7 == 5) System.out.print("Viernes");
            else if(total % 7 == 6) System.out.print("Sabado");
            else System.out.print("Domingo");
        
    }
        }
    
}
