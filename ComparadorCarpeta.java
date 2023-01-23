import java.util.Comparator;

//Clase comparador
public class ComparadorCarpeta implements Comparator<Carpeta> {
  @Override
  public int compare(Carpeta e1, Carpeta e2) {
    return (e1.NOMBRE).compareTo(e2.NOMBRE);
  }
}