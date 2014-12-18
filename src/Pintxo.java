class Pintxo {
    private int id;
    private String nombre;
    private String[] ingredientes;
    private int tipo; // 1: Basico 2:Selecto
    
    //1: Tortilla patata, ...
    //2: Foie,...
    //metodos getter/setter
    public void setId (int id) {
        this.id = id;
	}
	public int getId () {
        return id;
	}

	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public String getNombre () {
		return nombre;
	}	

	public void setIngredientes (String [] ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String [] getIngredientes () {
		return ingredientes;
	}

	public void setTipo (int tipo1) {
			this.tipo = tipo;
		}
	}
	public int getTipo () {
		return tipo;
	}    
}