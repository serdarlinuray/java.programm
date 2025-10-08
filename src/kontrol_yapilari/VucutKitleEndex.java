package kontrol_yapilari;

import java.util.Scanner;

public class VucutKitleEndex {
    public static void main(String[] args) {
           System.out.println("Vucut kitle endex programina xos geldiniz");
           Scanner deger = new Scanner(System.in);
           System.out.println("Cekinizi daxil edin kq ile: ");
           double kilo = deger.nextDouble();
           System.out.println("Boyunuzu daxil edin cm ile: ");
           int boys = deger.nextInt();

           double boy =  (double) boys / 100;
           double vucutkitle =  ( kilo / (Math.pow(boy,2)));
           System.out.println(vucutkitle);
           if (vucutkitle<15){
               System.out.println("Cox ciddi derecede dusuk kilolu");
           }else if (vucutkitle>15 && vucutkitle<16){
               System.out.println("Ciddi derecede dusuk kilolu");
           }else if (vucutkitle>16 && vucutkitle<18.5){
               System.out.println("Dusuk kilolu");
           }else if (vucutkitle>18.5 && vucutkitle<25){
               System.out.println("Normal(saglam) kilolu");
           }else if (vucutkitle>25 && vucutkitle<30){
               System.out.println("Fazla kilolu");
           }else if(vucutkitle>30 && vucutkitle<35){
               System.out.println("1 dereceden obez");
           }else if (vucutkitle>35 && vucutkitle<40){
               System.out.println("2 dereceden obez");
           }else{
               System.out.println("3 dereceden obez");
           }
        }
    }
