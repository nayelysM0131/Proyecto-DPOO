package OperacionesDeEntradaySalida;

public class Envio
{

				private String destino;
				private Pedido pedido;

				public String getDestino()
				{
								return this.destino;
				}

				/**
				 * 
				 * @param destino
				 */
				public void setDestino(String destino)
				{
								this.destino = destino;
				}

				public Pedido getPedido()
				{
								return this.pedido;
				}

				/**
				 * 
				 * @param pedido
				 */
				public void setPedido(Pedido pedido)
				{
								this.pedido = pedido;
				}

				/**
				 * 
				 * @param pedido
				 * @param destino
				 */
				public Envio(Pedido pedido, String destino)
				{
								// TODO - implement Envio.Envio
								throw new UnsupportedOperationException();
				}

}