package open_bootcamp.Coche_SOL_sesion24;

import java.util.ArrayList;

public class GestorCoches {
    CochesDBMemoria cochesDB = new CochesDBMemoria();

    public String listarCoches(ArrayList coches) {
        for(int i = 0; i < coches.size(); i++)
            return "Elemento en posición " + i + " " + coches;

        return null;
    }

    public Coche obtenerCoche(Coche coche) {
        if (coche instanceof CocheElectrico) {
            Coche cocheElectrico = new CocheElectrico();

            return cochesDB.buscar(cocheElectrico);
        }

        if (coche instanceof CocheDeCombustible) {
            Coche cocheDeCombustible = new CocheDeCombustible();

            return cochesDB.buscar(cocheDeCombustible);
        }

        if (coche instanceof CocheHibrido){
            Coche cocheHibrido = new CocheHibrido();

            return cochesDB.buscar(cocheHibrido);
        }

        return null;
    }

    public void crearCoche(Coche coche) {
        if (cochesDB.buscar(coche) != null) {
            System.out.println("El coche ya existe");
        }else {

            cochesDB.crear(coche);
        }
    }

    public void borrarCoche(Coche coche) {
        if (cochesDB.buscar(coche) != null) {
            cochesDB.borrar(coche);
        }
    }
}
