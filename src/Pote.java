class Pote {
    private int id;
    private String nombre;
    private int tipo; //1: Basico 2: Selecto
    
    //1: Agua, zurito, vino del año
    //2: Caña, refrescos, vino crianza
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
}