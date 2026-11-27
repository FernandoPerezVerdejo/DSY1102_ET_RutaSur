package Model;

public class Camion extends Vehiculo{
    private int cantidad_Ejes;
    private  String rubro;

    public Camion(String marca, String modelo, int anio, int cantidad_Ejes, String rubro) {
        super(marca, modelo, anio);
        this.cantidad_Ejes = cantidad_Ejes;
        this.rubro = rubro;
    }

    public Camion(int id, String marca, String modelo, int anio, int cantidad_Ejes, String rubro) {
        super(id, marca, modelo, anio);
        this.cantidad_Ejes = cantidad_Ejes;
        this.rubro = rubro;
    }

    public int getCantidad_Ejes() {
        return cantidad_Ejes;
    }

    public void setCantidad_Ejes(int cantidad_Ejes) {
        this.cantidad_Ejes = cantidad_Ejes;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public int getCostoBase(){
        return 7000;
    }


    @Override
    public String getTipo() {
        return "Camión";
    }

    @Override
    public int calcularPeaje(){
        int total=getCostoBase();
        total+=(300* cantidad_Ejes);
        if (rubro.equals("Agricola")){
            total+=1000;
        } else if (rubro.equals("Construccion")){
            total+=2000;
        }
        return total;
    }
}
