class Cartilla {
    private boolean[] sellos; //array de 10, para guardar los sellos, cada, item sera un bar
    
    //metodo sellar
    public void sellar(boolean sello) {
        boolean[] sellos ;
	}

    //metodo devolver dto correspondiente
	public boolean getSello(int id) {
        return sellos[id];
	}

    //metodos getter/setter
    public void setSellos(boolean[] sellos) {
        this.sellos = sellos;
	}
	public boolean[] getSellos() {
        return sellos;
	}
}