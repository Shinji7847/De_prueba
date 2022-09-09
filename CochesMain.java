package open_bootcamp.Coche_SOL_sesion24;

public class CochesMain {
    public static void main(String[] args){
        GestorCoches gestorCoches = new GestorCoches();

        Coche cocheElectrico = new CocheElectrico("Litio");
        cocheElectrico.patente = "ABC123";
        cocheElectrico.marca = "Chevrolet";
        cocheElectrico.modelo = "Astra";
        cocheElectrico.velocidad = 0;

        Coche cocheElectrico2 = new CocheElectrico("Litio");
        cocheElectrico2.patente = "ACD333";
        cocheElectrico2.marca = "Tesla";
        cocheElectrico2.modelo = "Model3";
        cocheElectrico2.velocidad = 0;

        Coche cocheHibrido = new CocheHibrido("Cadmio", "Diesel");
        cocheHibrido.patente = "AAB369";
        cocheHibrido.marca = "Ford";
        cocheHibrido.modelo = "Mondeo";
        cocheHibrido.velocidad = 0;

        Coche cocheDeCombustible = new CocheDeCombustible("Nafta");
        cocheDeCombustible.patente = "ACC111";
        cocheDeCombustible.marca = "Chevrolet";
        cocheDeCombustible.modelo = "Meriva";
        cocheDeCombustible.velocidad = 0;

        gestorCoches.crearCoche(cocheElectrico);
        gestorCoches.crearCoche(cocheDeCombustible);
        gestorCoches.crearCoche(cocheElectrico2);
        gestorCoches.crearCoche(cocheHibrido);

        System.out.println(gestorCoches.cochesDB.coches.size());
        gestorCoches.listarCoches(gestorCoches.cochesDB.coches);

        gestorCoches.obtenerCoche(cocheHibrido, "Mondeo");

        Coche mondeo = gestorCoches.obtenerCoche(cocheHibrido, "Mondeo");
        System.out.println("La patente del coche obtenido: " + cocheHibrido.patente);
        
        gestorCoches.borrarCoche(cocheElectrico2);

        System.out.println(gestorCoches.cochesDB.coches.size());
        gestorCoches.listarCoches(gestorCoches.cochesDB.coches);
    }
}
