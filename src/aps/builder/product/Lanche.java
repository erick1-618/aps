package aps.builder.product;

public class Lanche {

	private String pao;
	private String carne;
	private String queijo;
	private String molho;

	public void setPao(String pao) {
		this.pao = pao;
	}

	public void setCarne(String carne) {
		this.carne = carne;
	}

	public void setQueijo(String queijo) {
		this.queijo = queijo;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public void mostrar() {
        System.out.println("Lanche com: ");
        System.out.println("Pão: " + pao);
        System.out.println("Carne: " + carne);
        System.out.println("Queijo: " + queijo);
        System.out.println("Molho: " + molho);
    }
}
