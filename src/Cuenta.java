import java.util.ArrayList;
class Cuenta{
    private ArrayList <PintxoPote> cuenta;

    //metodos getter/setter
	public void setCuenta(ArrayList <PintxoPote> cuenta) {
		this.cuenta = cuenta;
	}

	public ArrayList <PintxoPote> getCuenta() {
		return cuenta;
	}
	
    // metodo imprimir en pantalla
	public void impr_pant() {
		System.out.println("La cuenta es de "+this.cuenta+" euros.");
	}
}