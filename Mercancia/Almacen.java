package Mercancia;

public class Almacen
{

				private Producto[] productos;
				private String ubicacion;

				public Producto[] getProductos()
				{
								return this.productos;
				}

				/**
				 * 
				 * @param productos
				 */
				public void setProductos(Producto[] productos)
				{
								this.productos = productos;
				}

				public String getUbicacion()
				{
								return this.ubicacion;
				}

				/**
				 * 
				 * @param ubicacion
				 */
				public void setUbicacion(String ubicacion)
				{
								this.ubicacion = ubicacion;
				}

}