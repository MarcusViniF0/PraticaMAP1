
public class Espresso extends PadraoCafe{
	public Espresso() {
		
	}
	@Override
	public double calculaValor(Cafe cafe) {
		
		return 1.99 + calcula(cafe);
	}

	@Override
	public String nome(Cafe cafe) {
		
		return " Espresso ";
	}
	@Override
	public String ADICIONAIS(Cafe cafe) {
		
		return null;
	}
	
}
