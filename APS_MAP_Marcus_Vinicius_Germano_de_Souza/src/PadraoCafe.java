
public abstract class PadraoCafe {
	
	protected PadraoCafe outroPadraoCafe;
	
	public PadraoCafe(PadraoCafe OutroPadraoCafe) {
		outroPadraoCafe = OutroPadraoCafe;
}
	
	public PadraoCafe() {
		
	}
	public abstract double calculaValor(Cafe cafe);
		public abstract String nome(Cafe cafe);
		public abstract String ADICIONAIS(Cafe cafe);
	protected double calcula(Cafe cafe) {
		if(outroPadraoCafe==null)
			return 0;
		else
			return outroPadraoCafe.calculaValor(cafe);
	}
	
}