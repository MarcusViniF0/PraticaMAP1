
public class Soy extends PadraoCafe{

	public Soy() {
		
	}
	@Override
	public double calculaValor(Cafe cafe) {
		
		return 00.15 + calcula(cafe);
	}

	@Override
	public String nome(Cafe cafe) {
		
		return " Soy ";
	}
	@Override
	public String ADICIONAIS(Cafe cafe) {
		
		return null;
	}
	
}
