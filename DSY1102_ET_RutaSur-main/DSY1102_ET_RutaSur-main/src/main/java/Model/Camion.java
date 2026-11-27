package Model;

public class Camion extends Vehiculo{
    private int cantidad_Ejes;
    private  String rubro;

    public int calcular_Tarifa_base(){
        int total=7000;
        total+=(300* cantidad_Ejes);
        if (rubro.equals("Agricola")){
            total+=1000;
        } else if (rubro.equals("Construccion")){
            total+=2000;
        }
        return total;
    }
}
