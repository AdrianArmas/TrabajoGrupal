class Main {
  public static void main(String[] args) {

        
        Carpeta c1 = new Carpeta("Capeta padre");
        Carpeta c2 = new Carpeta("Carpeta 1");
        Carpeta c3 = new Carpeta("Carpeta 2");
        Carpeta c4 = new Carpeta("Carpeta 3");

        Carpeta c5 = new Carpeta("Carpeta 4");
        Carpeta c6 = new Carpeta("Carpeta 5");
        Carpeta c7 = new Carpeta("Carpeta 6");

        Archivo a1 = new Archivo("Archivo 1.txt",22);

        c1.agregarC(c2);
        c1.agregarC(c3);
        c1.agregarC(c4);
        
        c2.agregarC(c5);
        c2.agregarC(c7);
        
        c3.agregarC(c6);
        
        c3.agregarA(a1);
        
        c1.mostrarDirectorio();
  }
}