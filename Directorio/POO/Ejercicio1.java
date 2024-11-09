package Directorio.POO;

public class Ejercicio1 {
    public String marca;
    public String modelo;
    public int anio;

    public Ejercicio1(String marca, int anio, String modelo) {
      this.marca = marca;
      this.anio = anio;
      this.modelo = modelo;
    }

    public String getMarca() {
      return marca;
    }

    public void setMarca(String marca) {
      this.marca = marca;
    }

    public String getModelo() {
      return modelo;
    }

    public void setModelo(String modelo) {
      this.modelo = modelo;
    }

    public int getAnio() {
      return anio;
    }

    public void setAnio(int anio) {
      this.anio = anio;
    }
  }

