package open_bootcamp.Coche_SOL_sesion24;

import java.util.ArrayList;

public class CochesDBMemoria {
    //Esta clase SOLO gestiona datos

    ArrayList<Coche> coches = new ArrayList<>();

    public CochesDBMemoria(){}

    public ArrayList<Coche> obtener() {
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
                coches.add(coche);
    }

    public void borrar(Coche coche) {
        ArrayList<Coche> coches = obtener();

        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).patente.equalsIgnoreCase(coche.patente)) {
                coches.remove(i);
            }
        }
    }
}
