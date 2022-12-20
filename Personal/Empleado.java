package Personal;
import Inicio.*;

public class Empleado extends Usuario
{

				private double salario;

				public double getSalario()
				{
								return this.salario;
				}

				/**
				 * 
				 * @param salario
				 */
				public void setSalario(double salario)
				{
								this.salario = salario;
				}

				/**
				 * 
				 * @param salario
				 * @param cargo
				 */
				
				public Empleado(String nombre, String contrasenna, String tipoDeUsuario)
				{
					super( nombre, contrasenna, tipoDeUsuario);
								// TODO - implement Empleado.Empleado
								throw new UnsupportedOperationException();
				}

}