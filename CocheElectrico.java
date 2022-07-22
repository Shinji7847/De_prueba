package open_bootcamp.Coche_SOL_sesion24;

public class CocheElectrico extends Coche {
    String tipoBateria;

    public CocheElectrico(){}
    public CocheElectrico(String tipoBateria) {
        super();
        this.tipoBateria = tipoBateria;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                ", tipoBateria='" + tipoBateria + '\'' +
                ", patente='" + patente + '\'' +
                '}';
    }
}
