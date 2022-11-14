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
        goles = numeroDeGoles;
    }
    public void setEsTitular(boolean siEsTitular){
        titular = siEsTitular;
    }
    public void imprimirEstadisticas(){
        System.out.println("El jugador " + nombre + " a marcado " + goles + " a dia de hoy, pero... ¿a sido titular?, la respuesta es... " + titular);
    }
    public String devolverEstadisticas(){
        return ("El jugador " + nombre + " a marcado " + goles + " a dia de hoy, pero... ¿a sido titular?, la respuesta es... " + titular);
    }
}