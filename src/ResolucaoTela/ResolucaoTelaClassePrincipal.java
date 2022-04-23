package ResolucaoTela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTelaClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Toolkit tela = Toolkit.getDefaultToolkit();
		Dimension dimensao = tela.getScreenSize();
		
		
		System.out.println("Sua tela tem resolução:");
		System.out.print(dimensao.width + "x"+ dimensao.height);

	}

}
