package Mercancia;

import AgentesExternos.*;

public class Producto
{

				private double precio;
				private String nombre;
				private Proveedor proveedor;
				private double costo;

				public double getPrecio()
				{
								return this.precio;
				}

				/**
				 * 
				 * @param precio
				 */
				public void setPrecio(double precio)
				{
								this.precio = precio;
				}

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

				public Proveedor getProveedor()
				{
								return this.proveedor;
				}

				/**
				 * 
				 * @param proveedor
				 */
				public void setProveedor(Proveedor proveedor)
				{
								this.proveedor = proveedor;
				}

				public double getCosto()
				{
								return this.costo;
				}

				/**
				 * 
				 * @param costo
				 */
				public void setCosto(double costo)
				{
								this.costo = costo;
				}

}