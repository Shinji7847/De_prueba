package open_bootcamp.Coche_SOL_sesion24;

import java.util.ArrayList;

public class GestorCoches {
    CochesDBMemoria cochesDB = new CochesDBMemoria();

    public void listarCoches(ArrayList coches) {
        System.out.println("Listado de coches");
        for(int i = 0; i < coches.size(); i++){
            System.out.println("El coche en posición " + i + " es " + coches.get(i));
        }
    }

    public Coche obtenerCoche(Coche coche, String modelo) {
        if (coche instanceof CocheElectrico) {
            Coche cocheElectrico = new CocheElectrico();
            coche.modelo = modelo;

            return cochesDB.buscar(cocheElectrico);
        }

        if (coche instanceof CocheDeCombustible) {
            Coche cocheDeCombustible = new CocheDeCombustible();
            coche.modelo = modelo;

            return cochesDB.buscar(cocheDeCombustible);
        }

        if (coche instanceof CocheHibrido){
            Coche cocheHibrido = new CocheHibrido();
            coche.modelo = modelo;

            return cochesDB.buscar(cocheHibrido);
        }

        return null;
    }

    public void crearCoche(Coche coche) {
        if(cochesDB.buscar(coche) != null){
            return;
        }

        cochesDB.crear(coche);
    }

    public void borrarCoche(Coche coche) {
        if(cochesDB.buscar(coche) == null){
            System.out.println("El coche que quiere borrar no existe");
        }

        cochesDB.borrar(coche);
    }
}

