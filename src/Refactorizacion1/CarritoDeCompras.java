package Refactorizacion1;


	import java.util.ArrayList;
	import java.util.List;

	public class CarritoDeCompras {
	    private List<Item> items;

	    public CarritoDeCompras() {
	        this.items = new ArrayList<>();
	    }

	    public void agregarItem(Item item) {
	        items.add(item);
	    }

	    public void removerItem(Item item) {
	        if (!items.contains(item)) {
	            throw new IllegalArgumentException("El ítem no existe en el carrito.");
	        }
	        items.remove(item);
	    }

	    public double calcularTotal() {
	        double total = 0;
	        for (Item item : items) {
	            total += item.getPrecio();
	        }
	        return total;
	    }

	    public void imprimirDetalle() {
	        System.out.println("Detalles del carrito de compras:");
	        for (Item item : items) {
	            System.out.println(item);
	        }
	        System.out.println("Total: €" + calcularTotal());
	    }
	}

	class Item {
	    private String nombre;
	    private double precio;
	    private static final double MAX_PRECIO = 10000.0;

	    public Item(String nombre, double precio) {
	        if (precio < 0 || precio > MAX_PRECIO) {
	            throw new IllegalArgumentException("Precio inválido.");
	        }
	        this.nombre = nombre;
	        this.precio = precio;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(double precio) {
	        if (precio < 0 || precio > MAX_PRECIO) {
	            throw new IllegalArgumentException("Precio inválido.");
	        }
	        this.precio = precio;
	    }

	    @Override
	    public String toString() {
	        return nombre + " - €" + precio;
	    }
	}


