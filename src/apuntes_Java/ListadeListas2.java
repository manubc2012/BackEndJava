package apuntes_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadeListas2 {
    public static void main(String[] args) {
        List<List<String>> usuarios= new ArrayList<>();
        ArrayList<String> usuario1= new ArrayList<>();
        ArrayList<String> usuario2= new ArrayList<>();

        Scanner sc=new Scanner(System.in);

        for (int i=0; i<3; i++){
            System.out.println("Ingrese los datos del usuraio 1");
           String datos= sc.nextLine();
           usuario1.add(datos);
        }
        for (int i=0; i<3; i++){
            System.out.println("Ingrese los datos del usuraio 2");
            String datos= sc.nextLine();
            usuario2.add(datos);
        }

        usuarios.add(usuario1);
        usuarios.add(usuario1);
        System.out.println("..........................");
        for (List<String> usuari:usuarios){
            for (String dato:usuari){
                System.out.print(dato + " ");
            }
            System.out.println();
        }

    }
}
