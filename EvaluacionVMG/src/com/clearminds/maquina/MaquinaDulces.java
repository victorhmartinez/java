package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void configurarMaquina(String codigoC1, String codigoC2, String codigoC3, String codigoC4) {
	celda1= new Celda(codigoC1);
	celda2= new Celda(codigoC2);
	celda3= new Celda(codigoC3);
	celda4= new Celda(codigoC4);
	
	}

	public void mostrarConfiguracion() {
		System.out.println("Codigo de celda: \n" + "Celda 1: " + getCelda1().getCodigo() + "\n" + "Celda 2: "
				+ getCelda2().getCodigo() + "\n" + "Celda 3: " + getCelda3().getCodigo() + "\n" + "Celda 4: "
				+ getCelda4().getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		if (getCelda1().getCodigo() == codigo) {
			return getCelda1();
		} else if (getCelda2().getCodigo() == codigo) {
			return getCelda2();
		} else if (getCelda3().getCodigo() == codigo) {
			return getCelda3();
		} else if (getCelda4().getCodigo() == codigo) {
			return getCelda4();
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigo, int stock) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.setProducto(producto);
		celdaRecuperada.setStock(stock);
	}

	public void mostrarProductos() {
		if(getCelda1().getProducto()==null) {
			System.out.println("************"+getCelda1().getCodigo());
			System.out.println("Stock: "+getCelda1().getStock());
			System.out.println("La celda no tiene producto !!!");
		}else {
			System.out.println("************"+getCelda1().getCodigo());
			System.out.println("Stock: "+getCelda1().getStock());
			System.out.println("Nombre producto: " + getCelda1().getProducto().getNombre() + "\n"
					+ "Precio producto: " + getCelda1().getProducto().getPrecio() + "\n"
							+"Codigo producto: "+ getCelda3().getProducto().getCodigo()	
					);
		}
		
		if(getCelda2().getProducto()==null) {
			System.out.println("************"+getCelda2().getCodigo());
			System.out.println("Stock: "+getCelda2().getStock());
			System.out.println("La celda no tiene producto !!!");
		
		}else {
			System.out.println("************"+getCelda2().getCodigo());
			System.out.println("Stock: "+getCelda2().getStock());
			System.out.println("Nombre producto: " + getCelda2().getProducto().getNombre() + "\n"
					+ "Precio producto: " + getCelda2().getProducto().getPrecio() + "\n"
							+"Codigo producto: "+ getCelda3().getProducto().getCodigo()	
					);
		}
		if(getCelda3().getProducto()==null) {
			System.out.println("************"+getCelda3().getCodigo());
			System.out.println("Stock: "+getCelda3().getStock());
			System.out.println("La celda no tiene producto !!!");
		}else {
			System.out.println("************"+getCelda3().getCodigo());
			System.out.println("Stock: "+getCelda3().getStock());
			System.out.println("Nombre producto: " + getCelda3().getProducto().getNombre() + "\n"
					+ "Precio producto: " + getCelda3().getProducto().getPrecio() + "\n"
					+"Codigo producto: "+ getCelda3().getProducto().getCodigo()
							
					);
		}
		if(getCelda4().getProducto()==null) {
			System.out.println("************"+getCelda4().getCodigo());
			System.out.println("Stock: "+getCelda4().getStock());
			System.out.println("La celda no tiene producto !!!");
		}else {
			System.out.println("************"+getCelda4().getCodigo());
			System.out.println("Stock: "+getCelda4().getStock());
			System.out.println("Nombre producto: " + getCelda4().getProducto().getNombre() + "\n"
					+ "Precio producto: " + getCelda4().getProducto().getPrecio() + "\n"
							+"Codigo producto: "+ getCelda3().getProducto().getCodigo()
					);
		}
		System.out.println("Saldo: "+getSaldo());
		/*
		 * System.out.println("Celda 1:\n" + "Codigo celda" + getCelda1().getCodigo() + "\n" + "Stock actual"
				+ getCelda1().getStock() + "\n" + "Nombre producto" + getCelda1().getProducto().getNombre() + "\n"
				+ "Precio producto" + getCelda1().getProducto().getPrecio() + "\n");
		System.out.println("*******************************");
		System.out.println("Celda 2:\n" + "Codigo celda" + getCelda2().getCodigo() + "\n" + "Stock actual"
				+ getCelda2().getStock() + "\n" + "Nombre producto" + getCelda2().getProducto().getNombre() + "\n"
				+ "Precio producto" + getCelda2().getProducto().getPrecio() + "\n");
		System.out.println("*******************************");
		System.out.println("Celda 3:\n" + "Codigo celda" + getCelda3().getCodigo() + "\n" + "Stock actual"
				+ getCelda3().getStock() + "\n" + "Nombre producto" + getCelda3().getProducto().getNombre() + "\n"
				+ "Precio producto" + getCelda3().getProducto().getPrecio() + "\n");
		System.out.println("*******************************");
		System.out.println("Celda 4:\n" + "Codigo celda" + getCelda4().getCodigo() + "\n" + "Stock actual"
				+ getCelda4().getStock() + "\n" + "Nombre producto" + getCelda4().getProducto().getNombre() + "\n"
				+ "Precio producto" + getCelda4().getProducto().getPrecio() + "\n");
		 * 
		 * */
	}
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
		if (getCelda1().getCodigo() == codigoCelda) {
			return getCelda1().getProducto();
		} else if (getCelda2().getCodigo() == codigoCelda) {
			return getCelda2().getProducto();
		} else if (getCelda3().getCodigo() == codigoCelda) {
			return getCelda3().getProducto();
		} else if (getCelda4().getCodigo() == codigoCelda) {
			return getCelda4().getProducto();
		} else {
			return null;
		}
	}
	public double consultarPrecio(String codigoCelda) {
		if (getCelda1().getCodigo() == codigoCelda) {
			return getCelda1().getProducto().getPrecio();
		} else if (getCelda2().getCodigo() == codigoCelda) {
			return getCelda2().getProducto().getPrecio();
		} else if (getCelda3().getCodigo() == codigoCelda) {
			return getCelda3().getProducto().getPrecio();
		} else if (getCelda4().getCodigo() == codigoCelda) {
			return getCelda4().getProducto().getPrecio();
		} else {
			return 0.0;
		}
	}
	public Celda buscarCeldaProducto(String codigo) {
		if (getCelda1().getProducto()!=null && getCelda1().getProducto().getCodigo() == codigo) {
			return getCelda1();
		} else if (getCelda2().getProducto()!=null &&getCelda2().getProducto().getCodigo() == codigo) {
			return getCelda2();
		} else if ( getCelda3().getProducto()!=null &&getCelda3().getProducto().getCodigo() == codigo) {
			return getCelda3();
		} else if ( getCelda4().getProducto()!=null &&getCelda4().getProducto().getCodigo() == codigo) {
			return getCelda4();
		} else {
			return null;
		}
	}
	
	public void incrementarProductos(String producto, int cant) {
		Celda celdaEncontrada =buscarCeldaProducto(producto);
		celdaEncontrada.setStock(celdaEncontrada.getStock()+cant);
		
	}
	public void vender(String codigoCelda) {
		
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		double valorProducto = celdaEncontrada.getProducto().getPrecio();
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		setSaldo(getSaldo()+valorProducto);
		mostrarProductos();
	}
	
	public double venderConCambio(String codigoCelda,double valorIngresado) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		double valorProducto = celdaEncontrada.getProducto().getPrecio();
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		setSaldo(getSaldo()+valorProducto);
		return valorIngresado-valorProducto;
	}
}
