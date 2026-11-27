package Model;

public abstract class Vehiculo {
    private int id;
    private String marca;
    private String modelo;
    private int anio;

    protected Vehiculo(String marca, String modelo, int anio) {
        setMarca(marca);
        setModelo(modelo);
        setAnio(anio);
    }

    protected Vehiculo(int id, String marca, String modelo, int anio) {
        setId(id);
        setMarca(marca);
        setModelo(modelo);
        setAnio(anio);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("El identificador no puede ser negativo.");
        }
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca == null || marca.isBlank()){
            throw new IllegalArgumentException("La Marca no puede estar vacía.");
        }
        this.marca = marca.trim();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo == null || modelo.isBlank()){
            throw new IllegalArgumentException("El Modelo no puede estar vacía.");
        }
        this.modelo = modelo.trim();
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio > 1960 && anio <= 2026){
            this.anio = anio;
        }else {
            throw new IllegalArgumentException("El año debe ser mayor a 1960 y menor o igual al año actual");
        }

    }

    public abstract String getTipo();
    public abstract int calcularPeaje();

}

