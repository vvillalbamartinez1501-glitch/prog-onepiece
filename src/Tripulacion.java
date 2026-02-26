public class Tripulacion {
    private String nombre;
    private Barco barco;
    private Pirata[] tripulacion;
    private int capitanId;

    private int MAX_TRIPULACION = 10;
    private int numeroPiratas = 0;

    public Tripulacion (String nombre, Barco barco, int capitanId) {
        this.nombre = nombre;
        this.barco = barco;
        this.capitanId = capitanId;
        this.tripulacion = new Pirata[MAX_TRIPULACION];
    }

    public boolean existePirata(int idPirataBuscado){
        boolean estaEnTripulacion = false;

        for (int i = 0 ; !estaEnTripulacion && i < MAX_TRIPULACION ; i++){
            if (tripulacion[i].getId() == idPirataBuscado){
                estaEnTripulacion = true;
            }
        }
        return estaEnTripulacion;
    }

    public int buscarIndicePirata(int idPirataBuscado){
        int posicionPirataEnTripulacion = -1;

        for (int i = 0 ; posicionPirataEnTripulacion == -1 && i < MAX_TRIPULACION ; i++){
            if (tripulacion[i].getId() == idPirataBuscado){
                posicionPirataEnTripulacion = i;
            }
        }
        return posicionPirataEnTripulacion;
    }

    public boolean reclutarPirata(Pirata pirataAReclutar){
        boolean pirataReclutado= true;
        int posicionPirataEnTripulacion;

        posicionPirataEnTripulacion = buscarIndicePirata(pirataAReclutar.getId());

        if (posicionPirataEnTripulacion != -1){
            pirataReclutado = false;
        } else {
            posicionPirataEnTripulacion = buscarHuecoLibreTripulacion();
            tripulacion[posicionPirataEnTripulacion] = pirataAReclutar;
        }
        return pirataReclutado;
    }

    private int buscarHuecoLibreTripulacion(){
        int posicionLibre = -1;
        for (int i = 0 ;posicionLibre == -1 &&  i < MAX_TRIPULACION ; i++){
            if (tripulacion[i] == null){
                posicionLibre = i;
            }
        }
        return posicionLibre;
    }

    public Pirata expulsarPirata(int idPirataAExpulsar){
        Pirata pirataExpulsado = null;
        int posicionPirataEnTripulacion;

        posicionPirataEnTripulacion =  buscarIndicePirata(idPirataAExpulsar);

        if(posicionPirataEnTripulacion != -1){
            pirataExpulsado = tripulacion[posicionPirataEnTripulacion];
            tripulacion[posicionPirataEnTripulacion] = null;
        }

        return pirataExpulsado;
    }

}
