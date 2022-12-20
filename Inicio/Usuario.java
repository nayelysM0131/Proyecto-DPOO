package Inicio;
public class Usuario
{

				protected String nombre;
				protected String contrasenna;
				protected String tipoDeUsuario;

				public String getNombre()
				{
								return this.nombre;
				}

				/**
				 * 
				 * @param nombre
				 */
				public void setNombre(String nombre)
				{
								this.nombre = nombre;
				}

				public String getContrasenna()
				{
								return this.contrasenna;
				}

				/**
				 * 
				 * @param contrasenna
				 */
				public void setContrasenna(String contrasenna)
				{
								this.contrasenna = contrasenna;
				}

				public String getTipoDeUsuario()
				{
								return this.tipoDeUsuario;
				}

				/**
				 * 
				 * @param tipoDeUsuario
				 */
				public void setTipoDeUsuario(String tipoDeUsuario)
				{
								this.tipoDeUsuario = tipoDeUsuario;
				}

				/**
				 * 
				 * @param nombre
				 * @param contrasenna
				 * @param tipoDeUsuario
				 */
				public Usuario(String nombre, String contrasenna, String tipoDeUsuario)
				{
								// TODO - implement Usuario.Usuario
								throw new UnsupportedOperationException();
				}

}