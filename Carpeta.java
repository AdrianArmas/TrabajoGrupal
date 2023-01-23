import java.util.TreeSet;

public class Carpeta {
  protected String NOMBRE;
  TreeSet<Carpeta> ts_carpeta = new TreeSet<>(new ComparadorCarpeta());

  public Carpeta(String NOMBRE) {
    this.NOMBRE = NOMBRE;

  }

  public String getNombre() {
    return NOMBRE;
  }

 public void mostrarDirectorio(){
      ts_carpeta.forEach(value ->{
          System.out.println(value.NOMBRE);
          value.ts_carpeta.forEach(value2 -> {value2.mostrarDirectorio();
              System.out.println(value2.NOMBRE);});
          
      });
  }

  public void agregarC(Carpeta c) {
    ts_carpeta.add(c);
  }

  
  public void agregarA(Archivo a) {
        String h;
        h=a.getNOMBRE();
        ts_carpeta.add(new Carpeta(h));
  }

}
