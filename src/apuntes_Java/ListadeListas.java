package apuntes_Java;

import java.util.ArrayList;
import java.util.List;

public class ListadeListas {
    public static void main(String[] args) {
        List<List<String>> usuario= new ArrayList<>();

        ArrayList<String> usuario1= new ArrayList<>();

        ArrayList<String> usuario2= new ArrayList<>();

        usuario1.add("Maria");
        usuario1.add("12");
        usuario1.add("maria13@mail.com");

        usuario2.add("Pepito");
        usuario2.add("15");
        usuario2.add("pepito@mail.com");

        for (int i=0; i<usuario1.size(); i++){
            System.out.println(usuario1.get(i));
        }

        for (int i=0; i<usuario2.size(); i++){
            System.out.println(usuario2.get(i));
        }

        //busqueda en los Arrays
        System.out.println(usuario1.indexOf("12"));
        int resp = usuario1.lastIndexOf("maria13@mail.com");
        if (resp!=0){
            System.out.println("usuario encontrado");
            System.out.println("La posición es "+ usuario1.indexOf("maria13@mail.com"));
        }else {
            System.out.println("usuario no encontrado");
        }

        //para adicionar los array alalista de listas

        usuario.add(usuario1);
        usuario.add(usuario2);

        int positionList=usuario.indexOf(usuario2);
        System.out.println(positionList);

        System.out.println("-----------------------------------");

        for (List<String> usuari:usuario){
            for (String dato:usuari){
                System.out.print(dato + " ");
            }
            System.out.println();
        }

    }
}
