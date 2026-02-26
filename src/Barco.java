public class Barco {
    private String nombre;
    private int resistencia;

    public Barco(String nombre, int resistencia) {
        this.nombre = nombre;
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }
    public int getResistencia() {
        return resistencia;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Barco:");

        sb.append("Nombre: ");
        sb.append(nombre);
        sb.append("\n");
        sb.append("Resistencia: ");
        sb.append(resistencia);
        sb.append("\n");

        return sb.toString();
    }
}
