import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {

    public static void main(String[] args) {

        // Creo el mapa: clave = nombre página, valor = número visitas
        HashMap<String, Integer> visitas = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        String pagina;

        // Bucle para pedir páginas hasta que se escriba "fin"
        while (true) {

            System.out.print("Introduce nombre de página (o 'fin' para terminar): ");
            pagina = sc.nextLine();

            // Si escribo "fin", salgo del bucle
            if (pagina.equals("fin")) {
                break;
            }

            // Si la página NO existe en el mapa
            if (!visitas.containsKey(pagina)) {

                // La añadimos con 1 visita
                visitas.put(pagina, 1);

            } else {

                // Si ya existe, obtengo su valor actual
                int contador = visitas.get(pagina);

                // Incremento en 1
                visitas.put(pagina, contador + 1);
            }
        }

        // Muestro resultados
        System.out.println("\nNúmero de visitas por página:");

        for (Map.Entry<String, Integer> entrada : visitas.entrySet()) {

            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
    }
}
