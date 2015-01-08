import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main (String args[]) {
  		
  		ArrayList <Bar> al_bar = new ArrayList <Bar>();
		ArrayList <Pintxo> al_pintxo = new ArrayList <Pintxo>();
		ArrayList <Pote> al_pote = new ArrayList <Pote>();
		
		al_pintxo=pintxo.cargarPintxos("pintxos.txt");
		al_pote=pote.cargarPotes("potes.txt");
		al_bar=bar.cargarBares("bares.txt");
		
		Scanner sc = new Scanner(System.in);
		int eleccion=0;
		do
		{
			System.out.print("\n\nMENU:");
			System.out.println("	1.Lectura de PINTXOS");
			System.out.println("	2.Lectura de POTES");
			System.out.println("	3.Lectura de BARES:");
			System.out.println("	4.Pedir ronda:");
			System.out.println("	5.Realizar cuenta:");
			System.out.println("	0.SALIR");			

			System.out.println("\nIntroduce el numero de la accion que quieres realizar: ");

			eleccion=sc.nextInt();	
			
			switch (eleccion) 
			{
				//leer archivo pintxos.txt
				case 1:
				{
					Pintxo pintxo=new Pintxo();
					pintxo.leerPintxos(al_pintxo);
					break;
				}
				//leer archivo potes.txt
				case 2:
				{
					Pote pote=new Pote();
					pote.leerPotes(al_pote);					
					break;
				}
				//leer archivo bares.txt
				case 3:
				{
					Bar bar=new Bar();
					bar.leerBares(al_bar);					
					break;
				}
				//Pedir ronda de pintxopote
				case 4:
				{
					//cargamos el ArrayList de PINTXOS
					Pintxo pintxo=new Pintxo();
					apintxo=pintxo.cargarPintxos(apintxo);
					//cargamos el ArrayList de POTES
					Pote pote=new Pote();
					apote=pote.cargarPotes(apote);
					//cargamos el ArrayList de BARES
					Bar bar=new Bar();
					abar=bar.cargarBares(abar);
					break;
				
				}
				//Realizar la cuenta de la ronda
				case 5:
				{
					break;
				}
				//Salir
				case 0:
				{
					break;
				}
				default: 
					System.out.println("\nOpcion incorrecta");
			}
		}while(eleccion!=0);
	}
}		  