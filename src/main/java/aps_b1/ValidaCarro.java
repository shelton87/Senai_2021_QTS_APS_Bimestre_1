package aps_b1;

public class ValidaCarro {

	public boolean validaIdCarro(int id) {
		if (id <= 0) {
			return false;
		}
		return true;

	}

	public boolean validaModeloCarro(String modelo) {

		if (modelo.length() > 20) {
			return false;
		}
		return true;

	}

	public boolean validaMarcaCarro(String marca) {

		if (marca.toUpperCase().equals("VW") || marca.toUpperCase().equals("GM")) {
			return true;
		}
		return false;

	}

	public boolean validaPlacaCarro(String placa) {

		if (placa.length() == 8) {
			return true;
		}
		return false;

	}

	public boolean validaAnoFabricacao(int ano) {

		if (ano > 1980) {
			return true;
		}
		return false;
	}

	public boolean validaPrecoFabricacao(float valor) {

		if (valor > 1 && valor < 50000) {
			return true;
		}
		return false;
	}

}
