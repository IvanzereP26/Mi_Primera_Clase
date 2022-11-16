public class Jugador {
    // Nombre del jugador
    private String nombre;
    // Numero de Goles
    private int goles;
    // Si es titular o no
    private boolean titular;
    
    public Jugador(String nombreDelJugador, int numeroDeGoles, boolean siEsTitular){
        nombre = nombreDelJugador;
        goles = numeroDeGoles;
        titular = siEsTitular;
    }
    public String getNombreDelJugador(){
        return nombre;
    }
    public int getnumeroGoles(){
        return goles;
    }
    public boolean siEsTitular(){
        return titular;
    }
    public void setNombreJugador(String nombreDelJugador){
        nombre = nombreDelJugador;
    }
    public void setNumeroGoles(int numeroDeGoles){
        goles += numeroDeGoles;
    }
    public void setEsTitular(){
        if (titular == true){
            titular = false;
        }
        else{
            titular = true;
        }
    }
    public void imprimirEstadisticas(){
        String titularidad = null;
        if (titular == true){
            titularidad = "sí.";
        }
        else{
            titularidad = "no.";
        }    
        System.out.println("El jugador " + nombre + " a marcado " + goles + " a dia de hoy, pero... ¿a sido titular?, la respuesta es... " + titularidad);
    }
    public String devolverEstadisticas(){
                String titularidad = null;
        if (titular == true){
            titularidad = "sí.";
        }
        else{
            titularidad = "no.";
        }   
        return ("El jugador " + nombre + " a marcado " + goles + " a dia de hoy, pero... ¿a sido titular?, la respuesta es... " + titularidad);
    }
}