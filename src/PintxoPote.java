class PintxoPote {
    private Pintxo pintxo;
    private Pote pote;
    private double precio;
    
    //metodo getter/setter
	public void setPintxo(Pintxo pintxo) {
		this.pintxo = pintxo;
	}
	public Pintxo getPintxo() {
		return pintxo;
	}

	public void setPote(Pote pote) {
		this.pote = pote;
	}
	public Pote getPote() {
		return pote;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Double getPrecio() {
		return precio;
	}
} 