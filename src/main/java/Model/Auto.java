package Model;

public class Auto extends Vehiculo {
    private int cantidad_Puertas;
    private  boolean tiene_Remolque;

    protected Auto(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    public Auto(int id, String marca, String modelo, int anio, int cantidad_Puertas, boolean tiene_Remolque) {
        super(id, marca, modelo, anio);
        this.cantidad_Puertas = cantidad_Puertas;
        this.tiene_Remolque = tiene_Remolque;
    }

    public int getCostoBase(){
        return 2700;
    }

    public int getCantidad_Puertas() {
        return cantidad_Puertas;
    }

    public void setCantidad_Puertas(int cantidad_Puertas) {
        this.cantidad_Puertas = cantidad_Puertas;
    }

    public boolean isTiene_Remolque() {
        return tiene_Remolque;
    }

    public void setTiene_Remolque(boolean tiene_Remolque) {
        this.tiene_Remolque = tiene_Remolque;
    }

    @Override
    public String getTipo() {
        return "Auto";
    }

    @Override
    public int calcularPeaje(){
        int total=getCostoBase();
        total+=(100*cantidad_Puertas);
        if (tiene_Remolque){
            total+=1000;
        }
        return total;
    }

}
