package open_bootcamp.Coche_SOL_sesion24;

public class CocheDeCombustible extends Coche{
    String tipoCombustible;

    public CocheDeCombustible(){}
    public CocheDeCombustible(String tipoCombustible){
        super();
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "CocheDeCombustible{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidad=" + velocidad +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", patente=" + patente +
                '}';
    }
}
