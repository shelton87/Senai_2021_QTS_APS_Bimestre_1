package aps_b1;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;

public class ValidaCarroTest {

	ValidaCarro valida = new ValidaCarro();
	
	// ############### Valida��o - ID ###############
	@Test
	public void testIdCarroValido() {
		Assert.assertEquals(true, valida.validaIdCarro(1));		
	}
	
	@Test
	public void testIdCarroInvalido() {
		Assert.assertEquals(false, valida.validaIdCarro(0));		
	}
	
	// ############### Valida��o - MODELO ###############
	@Test
	public void testModeloCarroValido() {
		Assert.assertEquals(true, valida.validaModeloCarro("Onix"));		
	}
	
	@Test
	public void testModeloCarroInvalido() {
		Assert.assertEquals(false, valida.validaModeloCarro("Subaru Impreza WRX STI Spec. C Type RA-R"));		
	}
	
	// ############### Valida��o - MARCA ###############
	@Test
	public void testMarcaCarroValido() {
		Assert.assertEquals(true, valida.validaMarcaCarro("Gm"));		
	}
	
	@Test
	public void testMarcaCarroInvalido() {
		Assert.assertEquals(false, valida.validaMarcaCarro("FIAT"));		
	}
	
	// ############### Valida��o - PLACA ###############
	@Test
	public void testPlacaCarroValido() {
		Assert.assertEquals(true, valida.validaPlacaCarro("IEV-7889"));		
	}
	
	@Test
	public void testPlacaCarroInvalido() {
		Assert.assertEquals(false, valida.validaPlacaCarro("IEV-788"));		
	}
	
	// ############### Valida��o - ANO FABRICA��O ###############
	@Test
	public void testAnoCarroValido() {
		Assert.assertEquals(true, valida.validaAnoFabricacao(1981));		
	}
	
	@Test
	public void testAnoCarroInvalido() {
		Assert.assertEquals(false, valida.validaAnoFabricacao(1980));		
	}
	
	// ############### Valida��o - VALOR TOTAL ###############
	@Test
	public void testValorTotalCarroValido() {
		Assert.assertEquals(true, valida.validaPrecoFabricacao(49999));		
	}
	
	@Test
	public void testValorTotalCarroInvalido() {
		Assert.assertEquals(false, valida.validaPrecoFabricacao(50000));		
	}	

}
