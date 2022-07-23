package open_bootcamp.Coche_SOL_sesion24;

import java.util.ArrayList;

public class CochesDBMemoria {
    ArrayList<Coche> coches = new ArrayList<>();


    public CochesDBMemoria(){}

    public ArrayList<Coche> listar(Coche coche) {
            return coches;
    }

    public Coche buscar(Coche coche) {
       for (Coche cocheActual : coches) {
           if (cocheActual.patente.equalsIgnoreCase(coche.patente)) {
                return cocheActual;
           }
       }
       return null;
    }

    public void crear(Coche coche){

        for (Coche cocheActual : coches) {
            if (cocheActual.patente.equalsIgnoreCase(coche.patente)) {
                System.out.println("El coche ya fue creado");
            }else {
                coches.add(coche);
            }
        }
    }

    public void borrar(Coche coche) {
        for (int i = 0; i < coches.size(); i++) {
            Coche cocheElectrico = coches.get(i);
            if (cocheElectrico.patente.equalsIgnoreCase(cocheElectrico.patente.toLowerCase())) {
                coches.remove(i);
            }
        }
    }
}
