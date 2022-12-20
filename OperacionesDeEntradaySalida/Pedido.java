package OperacionesDeEntradaySalida;

import Mercancia.*;

public class Pedido
{

				private Producto producto;
				private String fechaDeEntrega;
				private int cantidad;

				public Producto[] getProductos()
				{
								// TODO - implement Pedido.getProductos
								throw new UnsupportedOperationException();
				}

				/**
				 * 
				 * @param productos
				 */
				public void setProductos(Producto[] productos)
				{
								// TODO - implement Pedido.setProductos
								throw new UnsupportedOperationException();
				}

				public String getFechaDeEntrega()
				{
								return this.fechaDeEntrega;
				}

				/**
				 * 
				 * @param fechaDeEntrega
				 */
				public void setFechaDeEntrega(String fechaDeEntrega)
				{
								this.fechaDeEntrega = fechaDeEntrega;
				}

				public int getCantidad()
				{
								return this.cantidad;
				}

				/**
				 * 
				 * @param cantidad
				 */
				public void setCantidad(int cantidad)
				{
								this.cantidad = cantidad;
				}

				public double calcularPrecio()
				{
								// TODO - implement Pedido.calcularPrecio
								throw new UnsupportedOperationException();
				}

}