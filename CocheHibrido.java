package open_bootcamp.Coche_SOL_sesion24;

public class CocheHibrido extends Coche{
    String tipoCombustible;
    String tipoBateria;

    public CocheHibrido(){}
    public CocheHibrido(String tipoBateria, String tipoCombustible){
        super();
        this.tipoCombustible = tipoCombustible;
        this.tipoBateria = tipoBateria;
    }

    @Override
    public String toString() {
        return "CocheHibrido{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", tipoBateria='" + tipoBateria + '\'' +
                ", patente='" + patente + '\'' +
                '}';
    }
}
