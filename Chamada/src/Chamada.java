import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Chamada {
    public static void main(String[] args) {

        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Joao");
        listaNomes.add("Maria");
        listaNomes.add("Jose");

        HashMap<String, String> comparecimento = new HashMap<>();
        comparecimento.put("P", "Presente");
        comparecimento.put("A", "Ausente");

        HashMap<String, String> dia = new HashMap<>();
        dia.put("1", "11/04/2022");
        dia.put("2", "12/04/2022");
        dia.put("3", "13/04/2022");

        System.out.println("-- LISTA DE CHAMADA --");
        System.out.println(dia.get("1") + " - " + listaNomes.get(0) + " - " + comparecimento.get("P"));
        System.out.println(dia.get("1") + " - " + listaNomes.get(1) + " - " + comparecimento.get("A"));
        System.out.println(dia.get("1") + " - " + listaNomes.get(2) + " - " + comparecimento.get("P"));
        System.out.println();
        System.out.println(dia.get("2") + " - " + listaNomes.get(0) + " - " + comparecimento.get("A"));
        System.out.println(dia.get("2") + " - " + listaNomes.get(1) + " - " + comparecimento.get("A"));
        System.out.println(dia.get("2") + " - " + listaNomes.get(2) + " - " + comparecimento.get("P"));
        System.out.println();
        System.out.println(dia.get("3") + " - " + listaNomes.get(0) + " - " + comparecimento.get("P"));
        System.out.println(dia.get("3") + " - " + listaNomes.get(1) + " - " + comparecimento.get("P"));
        System.out.println(dia.get("3") + " - " + listaNomes.get(2) + " - " + comparecimento.get("A"));
    }
}