package open_bootcamp.Coche_SOL_sesion24;

import java.util.ArrayList;

public class CochesDBMemoria {
    ArrayList<Coche> cochesElectricos = new ArrayList<>();
    ArrayList<Coche> cochesDeCombustion = new ArrayList<>();
    ArrayList<Coche> cochesHibridos = new ArrayList<>();

    public CochesDBMemoria(ArrayList<Coche> cochesElectricos, ArrayList<Coche> cochesDeCombustion,
                           ArrayList<Coche> cochesHibridos) {
        this.cochesElectricos = cochesElectricos;
        this.cochesDeCombustion = cochesDeCombustion;
        this.cochesHibridos = cochesHibridos;
    }

    public ArrayList<Coche> listar(Coche coche) {

        boolean b1 = coche instanceof CocheElectrico;
        boolean b2 = coche instanceof CocheDeCombustible;
        boolean b3 = coche instanceof CocheHibrido;

        if (b1) {
            return cochesElectricos;
        } else if (b2) {
            return cochesDeCombustion;
        } else if (b3) {
            return cochesHibridos;
        }

        return null;
    }

    public Coche buscar(Coche coche) {
        boolean b1 = coche instanceof CocheElectrico;
        boolean b2 = coche instanceof CocheDeCombustible;
        boolean b3 = coche instanceof CocheHibrido;

        if (b1) {
            for (Coche cocheActual : cochesElectricos) {
                if (cocheActual.patente.equalsIgnoreCase(coche.patente)) {
                    return cocheActual;
                }
            }

        } else if (b2) {
            for (Coche cocheActual : cochesDeCombustion) {
                if (cocheActual.patente.equalsIgnoreCase(coche.patente)) {
                    return cocheActual;
                }

            } if (b3) {
                for (Coche cocheActual : cochesHibridos) {
                    if (cocheActual.patente.equalsIgnoreCase(coche.patente)) {
                        return cocheActual;
                    }
                }

                return null;
            }

            public void crear(Coche coche){
                b1 = coche instanceof CocheElectrico;
                b2 = coche instanceof CocheDeCombustible;
                b3 = coche instanceof CocheHibrido;

                if (b1) {
                    for (Coche cocheActual : cochesElectricos) {
                        if (cocheActual.patente.equalsIgnoreCase(coche.patente)) {
                            System.out.println("El coche ya fue creado");
                        } else {
                            cochesElectricos.add(coche);
                        }
                    }
                } else if (b2) {
                    for (Coche cocheActual : cochesDeCombustion) {
                        if (cocheActual.patente.equalsIgnoreCase(coche.patente)) {
                            System.out.println("El coche ya fue creado");
                        } else {
                            cochesDeCombustion.add(coche);
                        }
                    }
                } else if (b3) {
                    for (Coche cocheActual : cochesHibridos) {
                        if (cocheActual.patente.equalsIgnoreCase(coche.patente)) {
                            System.out.println("El coche ya fue creado");
                        } else {
                            cochesHibridos.add(coche);
                        }
                    }
                }
            }

            public void borrar(Coche coche){
                b1 = coche instanceof CocheElectrico;
                b2 = coche instanceof CocheDeCombustible;
                b3 = coche instanceof CocheHibrido;

                if (b1) {
                    for (int i = 0; i < cochesElectricos.size(); i++) {
                        Coche cocheElectrico = cochesElectricos.get(i);
                        if (cocheElectrico.patente.equalsIgnoreCase(cocheElectrico.patente.toLowerCase())) {
                            cochesElectricos.remove(i);
                        }
                    }
                } else if (b2) {
                    for (int i = 0; i < cochesDeCombustion.size(); i++) {
                        Coche cocheDeCombustible = cochesDeCombustion.get(i);
                        if (cocheDeCombustible.patente.equalsIgnoreCase(cocheDeCombustible.patente.toLowerCase())) {
                            cochesDeCombustion.remove(i);
                        }
                    }
                } else if (b3) {
                    for (int i = 0; i < cochesHibridos.size(); i++) {
                        Coche cocheHibrido = cochesHibridos.get(i);
                        if (cocheHibrido.patente.equalsIgnoreCase(cocheHibrido.patente.toLowerCase())) {
                            cochesHibridos.remove(i);
                        }
                    }
                }
            }
        }
    }
}