class BalancoTrimestral{
	public static void main(String[] args) {

		int gastosJaneiro = 15000;
		int gastosFevereiro=23000;
		int gastosMarco=17000;

		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaTrim = gastosTrimestre/3;

		System.out.println("Os gastos no trimestre forao de: "+gastosTrimestre);
		System.out.println("A media no trimestre foi de: "+mediaTrim);

	}
}