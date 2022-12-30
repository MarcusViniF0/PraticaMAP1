
public class VENTI extends PadraoCafe{

	public VENTI(PadraoCafe outroCafe) {
		super(outroCafe);
	}
	public VENTI() {
		
	}
	@Override
	public double calculaValor(Cafe cafe) {
		
		return 14.35 + calcula(cafe);
	}
	@Override
	public String nome(Cafe cafe) {
		
		return " grande ";
	}
	@Override
	public String ADICIONAIS(Cafe cafe) {
		// TODO Auto-generated method stub
		return null;
	}

}
