public class Pirata {
    private int id;
    private String nombre;
    private double recompensa;

    public Pirata (int id, String nombre, double recompensa) {
        this.id = id;
        this.nombre = nombre;
        this.recompensa = recompensa;
    }

    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public double getRecompensa(){
        return recompensa;
    }



    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Pirata:");

        sb.append("[");
        sb.append(id);
        sb.append("]");

        sb.append(" - ");

        sb.append(nombre);
        sb.append(" - ");

        sb.append("Recompensa: ");
        sb.append(recompensa);
        sb.append(" berries");

        sb.append("\n");

        return sb.toString();
    }
}
