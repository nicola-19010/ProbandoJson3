import java.util.List;

public class Animales {
    private String nombre;
    private int vida;

    private List<String> nombreAtaques;
    private List<Integer> ataques;

    public Animales() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public List<String> getNombreAtaques() {
        return nombreAtaques;
    }

    public void setNombreAtaques(List<String> nombreAtaques) {
        this.nombreAtaques = nombreAtaques;
    }

    public List<Integer> getAtaques() {
        return ataques;
    }

    public void setAtaques(List<Integer> ataques) {
        this.ataques = ataques;
    }
}
