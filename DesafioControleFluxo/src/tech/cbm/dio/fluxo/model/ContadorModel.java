package tech.cbm.dio.fluxo.model;

import java.util.Locale;
import java.util.Scanner;

import tech.cbm.dio.fluxo.exceptions.ParametrosInvalidosException;

public class ContadorModel {
	private int						parametroUm;
	private int						parametroDois;

	public void getDadosFromTerminal() {
		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o primeiro parâmetro:");
		this.parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro:");
		this.parametroDois = terminal.nextInt();

	}

	public void contar() throws ParametrosInvalidosException {
		if (parametroUm > parametroDois)
			throw new ParametrosInvalidosException();

		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o numero " + i);
		}
	}
}
