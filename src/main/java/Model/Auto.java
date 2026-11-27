package Model;

public class Auto extends Vehiculo {
    private int cantidad_Puertas;
    private  boolean tiene_Remolque;

    public int calcular_Tarifa_Base(){
        int total=2700;
        total+=(100*cantidad_Puertas);
        if (tiene_Remolque){
            total+=1000;
        }
        return total;
    }
}
