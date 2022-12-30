
public class Whip extends PadraoCafe{
	public Whip() {
		
	}

	@Override
	public double calculaValor(Cafe cafe) {
		
		return 00.10 + calcula(cafe);
		
	}

	@Override
	public String nome(Cafe cafe) {
		
		return " Whip ";
	}

	@Override
	public String ADICIONAIS(Cafe cafe) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
