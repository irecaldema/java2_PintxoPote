import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
class Pote {
    private int id;
    private String nombre;
    private int tipo; //1: Basico 2: Selecto
    
    //1: Agua, zurito, vino del año
    //2: Caña, refrescos, vino crianza
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
	
	public ArrayList<Pote> cargarPotes (String archivo_potes) 
	{		
		
		String linea="";
		
		ArrayList <Pote> al_potes = new ArrayList <Pote>();
		
		try
		{	
			FileReader fr = new FileReader (archivo_potes);
			BufferedReader bf = new BufferedReader(fr);
	       	linea = bf.readLine();
			String[] separado = null;//para separar el codigo, nombre del pintxo, ingredientes y el tipo
			
			
			while (linea!=null)
			{     

				Pote o_potes = new Pote();
					 			
	 			//separamos los datos en el array
	 			separado=linea.split(",");

	 			//introducimos los valores en los objetos para despues añadirlos al AarrayList
	 			o_potes.setId(Integer.parseInt(separado[0]));
	 			o_potes.setNombre(separado[1]);
				o_potes.setTipo(Integer.parseInt(separado[2]));

				apotes.add(o_potes);

	 			//leo la proxima linea
				linea = bf.readLine();
			}
		}

		catch(Exception e)
	    {
			System.out.println("Error: "+e);
	    }

	    return apotes;

	}
	
}