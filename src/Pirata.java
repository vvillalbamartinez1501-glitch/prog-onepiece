public class Pirata {
    private int id;
    private String nombre;
    private double recompensa;

    /**
     * Constructor de la clase Pirata
     * @param id identificado único por Pirata
     * @param nombre Ombre oficial del pirata
     * @param recompensa recompensa en formato double por captura del pirata
     */
    public Pirata (int id, String nombre, double recompensa) {
        this.id = validarId(id);
        this.nombre = nombre;
        this.recompensa = recompensa;
    }

    public Pirata() {

    }

    public int validarId(int id){

        try{
            if (id < 0 ) {
                throw new Exception("Código inválido");
            }
        } catch (NumberFormatException e){
                System.err.println("El id ha de ser un número");
        } finally{
            return id;
        }
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

    /**
     * toString en formato de una sola linea
     * @return [id] - nombreDelPirata Recompensa: recompensaSobreSuCaptura
     */

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
