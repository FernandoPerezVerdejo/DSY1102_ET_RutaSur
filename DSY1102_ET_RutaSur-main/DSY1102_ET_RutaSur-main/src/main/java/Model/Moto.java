package Model;

public class Moto extends Vehiculo{
    private boolean tiene_Equpaje;
    private int cilindros;


    public int calcular_Tarifa_Base(){
        int total=800;
        if (tiene_Equpaje){
            total+=1100;
        }
        if (cilindros>200){
            total+=800;
        }
        return total;
    }
}
