package Model;

public class Moto extends Vehiculo{
    private boolean tiene_Equpaje;
    private int cilindros;

    public Moto(String marca, String modelo, int anio, boolean tiene_Equpaje, int cilindros) {
        super(marca, modelo, anio);
        this.tiene_Equpaje = tiene_Equpaje;
        this.cilindros = cilindros;
    }

    public Moto(int id, String marca, String modelo, int anio, boolean tiene_Equpaje, int cilindros) {
        super(id, marca, modelo, anio);
        this.tiene_Equpaje = tiene_Equpaje;
        this.cilindros = cilindros;
    }

    public boolean isTiene_Equpaje() {
        return tiene_Equpaje;
    }

    public void setTiene_Equpaje(boolean tiene_Equpaje) {
        this.tiene_Equpaje = tiene_Equpaje;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getCostoBase(){
        return 800;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }

    @Override
    public int calcularPeaje(){
        int total=getCostoBase();
        if (tiene_Equpaje){
            total+=1100;
        }
        if (cilindros>200){
            total+=800;
        }
        return total;
    }
}
