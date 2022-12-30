
public class TALL extends PadraoCafe{

	public TALL(PadraoCafe outroCafe) {
		super(outroCafe);
	}
	public TALL() {
		
	}
	@Override
	public double calculaValor(Cafe cafe) {
		System.out.println("+====Cafe====+");
		return 14.00+calcula(cafe);
	}
	@Override
	public String nome(Cafe cafe) {
		
		return " Pequeno ";
	}
	@Override
	public String ADICIONAIS(Cafe cafe) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
