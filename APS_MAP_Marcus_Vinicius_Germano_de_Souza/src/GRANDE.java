
public class GRANDE extends PadraoCafe{
	public GRANDE(PadraoCafe outroCafe) {
		super(outroCafe);
	}
	GRANDE(){
		
	}
	@Override
	public double calculaValor(Cafe cafe) {
		
		return 14.2 + calcula(cafe);
	}
	@Override
	public String nome(Cafe cafe) {
		
		return " médio ";
	}
	@Override
	public String ADICIONAIS(Cafe cafe) {
		// TODO Auto-generated method stub
		return null;
	}
}
