import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
class Bar {
    private int id;
    private String nombre;
    private String direccion;
    private ArrayList <Pintxo> pintxos;
    private ArrayList <Pote> potes;
    
    //metodos getter/setter
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}

	public void setPintxos(ArrayList <Pintxo> pintxos) {
		this.pintxos = pintxos;
	}
	public ArrayList <Pintxo> getPintxos() {
		return pintxos;
	}

	public void setPote(ArrayList <Pote> potes) {
		this.potes = potes;
	}
	public ArrayList <Pote> getPote() {
		return potes;
	}
}