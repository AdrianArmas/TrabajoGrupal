//import java.util.HashMap;
public class Archivo{
  public String NOMBRE;
  private int TAMANIO;
  // HashMap<Integer, Carpeta> Carpeta;

  public Archivo(String NOMBRE, int TAMANIO) {
    this.NOMBRE = NOMBRE;
    this.TAMANIO = TAMANIO;
  }

      public String getNOMBRE() {
        return NOMBRE;
    }

    public int getTAMANIO() {
        return TAMANIO;
    }
}