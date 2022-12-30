
public class Teste {

	public static void main(String[] args) {
		Cafe cafe = new Cafe(3500);
		
		//tamanhos
		PadraoCafe pequeno = new TALL();
		PadraoCafe medio = new GRANDE();
		PadraoCafe grande = new VENTI();
		PadraoCafe PM = new TALL(new GRANDE());
		PadraoCafe PMG = new TALL(new GRANDE(new VENTI()));
		PadraoCafe Montado = new TALL(new Mocha());
		PadraoCafe Montado2 = new GRANDE(new Soy());
		
		//sabores
		PadraoCafe Mocha = new Mocha();
		PadraoCafe Espresso = new Espresso();
		PadraoCafe Soy=new Soy();
		PadraoCafe Whip=new Whip();
		
		//Adicionais de café
		PadraoCafe Calda_de_chocolate=new Calda_de_chocolate();
		PadraoCafe Calda_de_caramelo=new Calda_de_caramelo();
		PadraoCafe Chantilly=new Chantilly();
		PadraoCafe Barra_de_chocolate=new Barra_de_chocolate();
		
		//Adicionais de café
		String ADD1= Calda_de_chocolate.ADICIONAIS(cafe);
		String ADD2= Calda_de_caramelo.ADICIONAIS(cafe);
		String ADD3= Chantilly.ADICIONAIS(cafe);
		String ADD4= Barra_de_chocolate.ADICIONAIS(cafe);
		
		//nomes tamanhos
		double valor1= pequeno.calculaValor(cafe);
		double valor2= medio.calculaValor(cafe);
		double valor3= grande.calculaValor(cafe);
		double valor4= PM.calculaValor(cafe);
		double valor5= PMG.calculaValor(cafe);
		
		//valores sabores
	    double valorsabor1= Mocha.calculaValor(cafe);
	    double valorsabor2= Espresso.calculaValor(cafe);
	    double valorsabor3= Soy.calculaValor(cafe);
	    double valorsabor4= Whip.calculaValor(cafe);
	    
	    //nomes dos sabores
	    String nomesabor1= Mocha.nome(cafe);
	    String nomesabor2= Espresso.nome(cafe);
	    String nomesabor3= Soy.nome(cafe);
	    String nomesabor4= Whip.nome(cafe);
	    
	    //nome tamanho
	    String nometamanho1= pequeno.nome(cafe);
	    String nometamanho2= medio.nome(cafe);
	    String nometamanho3= grande.nome(cafe);
	    
	    //sabor com tamanho
	    double valorsabor_tamanho1= Montado.calculaValor(cafe);
	    double valorsabor_tamanho2= Montado2.calculaValor(cafe);
	    
	    
	    //tamanhos com valores
	    System.out.println("café "+nomesabor1+": "+"R$ "+valor1);
		System.out.println("café "+nomesabor2+": "+"R$ "+valor2 );
		System.out.println("cefé "+nomesabor3+": "+"R$ "+valor3 );
		System.out.println("cefé "+nomesabor3+"+"+nomesabor1+": "+"R$ "+valor4 );
		System.out.println("cefé meido + pequeno + grande: "+"R$ "+valor5 );
	    
	    //sabores com valores
		System.out.println("cefé Mocha: "+"R$ "+valorsabor1 );
		System.out.println("cefé Espresso: "+"R$ "+valorsabor2 );
		System.out.println("cefé Soy: "+"R$ "+valorsabor3 );
		System.out.println("cefé Whip: "+"R$ "+valorsabor4 );
		
		
		//valor do café montado
		System.out.println("+===============+Café+===============+"
				+ "\num café "+nomesabor1+
				"\ntamanho "+nometamanho1+" : "+"R$ "+valorsabor_tamanho1+
				"\nadicional por fora: "+ADD2);
				
		System.out.println("+===============+Café+===============+"
				+ "\num café "+nomesabor2+
				"\ntamanho "+nometamanho2+" : "+"R$ "+valorsabor_tamanho2+
				"\nadicional por fora: "+ADD3);
	}

}
