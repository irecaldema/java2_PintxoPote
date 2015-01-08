import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
class Pintxo {
    private int id;
    private String nombre;
    private String[] ingredientes;
    private int tipo; // 1: Basico 2:Selecto
    
    //1: Tortilla patata, ...
    //2: Foie,...
    
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

	public void setIngredientes(String [] ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String [] getIngrediente() {
		return ingredientes;
	}

	public void setTipo(int tipo) {
			this.tipo = tipo;
	}
	public int getTipo() {
		return tipo;
	}    
	
	public ArrayList<Pintxo> cargarPintxos (String archivo_pintxos) throws IOException {		
		
		String linea="";
		ArrayList <Pintxo> al_pintxo = new ArrayList <Pintxo>();

		FileReader fr = new FileReader (archivo_pintxos);
		BufferedReader bf = new BufferedReader(fr);
       	linea = bf.readLine();
		String[] separado = null;//para separar el codigo, nombre del pintxo, ingredientes y el tipo
		String[] separado2 = null;//para separar los ingredientes
	
		while (linea!=null)	{     
			//creamos los objetos
			Pintxo o_pintxo=new Pintxo();
				 			
 			//separamos los datos en el array
 			separado=linea.split("#");

 			//introducimos los valores en los objetos para despues añadirlos al AarrayList
 			o_pintxo.setId(Integer.parseInt(separado[0]));
 			o_pintxo.setNombre(separado[1]);

 			//ingredientes
	 			
 			String ingredientes=separado[2];
			separado2=ingredientes.split(";");

			o_pintxo.setIngredientes(separado2);
			o_pintxo.setTipo(Integer.parseInt(separado[3]));
			al_pintxo.add(o_pintxo);

 			//leo la proxima linea
			linea = bf.readLine();

		}
	    return al_pintxo;
	}
	
	public void leerPintxos (ArrayList<Pintxo> al_pintxo) throws IOException	{
		String linea="";
		Double precio=0.0;
		for (int i=0;i<al_pintxo.size();i++){
			if (al_pintxo.get(i).getTipo()==1){
				precio=1.50;
			}
			else {
				precio=2.00;
			}
			System.out.print("\n" + al_pintxo.get(i).getNombre() + " " + precio+"€");
		}	
	}
}