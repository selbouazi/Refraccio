package practicaunidad4;

/**
 * Representa un compte bancari amb operacions bàsiques d'ingrés i retirada.
 * Conté informació del titular, número de compte, saldo i tipus d'interès.
 */
public class CCuenta {

	private String nombre; // Nom del titular
	private String cuenta; // Número de compte
	private double saldo; // Saldo actual
	private double tipoInteres; // Tipus d'interès

	/** Constructor buit. Crea un compte sense inicialitzar els atributs. */
	public CCuenta() {
		// Constructor per defecte
	}

	/**
	 * Constructor amb paràmetres. Crea un compte amb valors inicials.
	 *
	 * @param nom  nom del titular
	 * @param cue  número de compte
	 * @param sal  saldo inicial
	 * @param tipo tipus d'interès
	 */
	public CCuenta(final String nom, final String cue, final double sal, final double tipo) {
		this.nombre = nom;
		this.cuenta = cue;
		this.saldo = sal;
		this.tipoInteres = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;

	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(final String cuenta) {
		this.cuenta = cuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(final double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(final double nuevoSaldo) {
		this.saldo = nuevoSaldo;
	}

	/**
	 * Ingresa una quantitat al compte.
	 *
	 * @param cantidad quantitat a ingressar
	 * @throws IllegalArgumentException si la quantitat és negativa
	 */
	public void ingresar(final double cantidad) {
		if (cantidad < 0) {
			throw new IllegalArgumentException("No es pot ingressar una quantitat negativa");
		}
		setSaldo(saldo + cantidad);
	}

	/**
	 * Retira una quantitat del compte.
	 *
	 * @param cantidad quantitat a retirar
	 * @throws IllegalArgumentException si la quantitat és negativa o no hi ha saldo
	 *                                  suficient
	 */
	public void retirar(final double cantidad) {
		if (cantidad < 0) {
			throw new IllegalArgumentException("No es pot retirar una quantitat negativa");
		}
		if (saldo < cantidad) {
			throw new IllegalArgumentException("No hi ha saldo suficient");
		}
		setSaldo(saldo - cantidad);
	}
}
