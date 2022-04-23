
//AULA JAVA #04
package IdiomaSistema;

import java.util.Locale;

public class IdiomaSistemaClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale idioma = Locale.getDefault();
		
		System.out.println("Seu sistema está em:");
		System.out.print(idioma.getDisplayLanguage());

	}

}
