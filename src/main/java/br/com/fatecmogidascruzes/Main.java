package br.com.fatecmogidascruzes;

import java.util.Scanner;
import java.time.LocalDate;
import br.com.fatecmogidascruzes.entidades.*;
import br.com.fatecmogidascruzes.enums.TIPO_MODAL;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static Passageiro criarPassageiro() {
        System.out.print("Qual é o seu nome?: ");
        String nome = sc.nextLine();

        System.out.print("Qual é o seu CPF?: ");
        String cpf = sc.nextLine();

        return new Passageiro(nome, cpf, obterData("nascimento"));
    }

    public static Viagem criarViagem(int indice) {
        System.out.printf("Cadastro da %d° viagem:\n", (indice + 1));
        System.out.println("1 - Aéreo");
        System.out.println("2 - Rodoviário");
        System.out.println("3 - Ferroviário");
        System.out.print("Qual o modal desta viagem?: ");
        int escolha = Integer.parseInt(sc.nextLine());

        System.out.println("1 - PADRÃO");
        System.out.println("2 - LUXO");
        System.out.print("Qual o tipo desta viagem?: ");
        TIPO_MODAL tipo = Integer.parseInt(sc.nextLine()) == 1 ? TIPO_MODAL.STANDARD : TIPO_MODAL.LUXURY;
        System.out.print("Qual o código personalizado para esta viagem?: ");
        String codigoPersonalizado = sc.nextLine();

        return switch (escolha) {
            case 1 -> new Aereo(tipo, codigoPersonalizado, obterData("viagem"));
            case 2 -> new Rodoviario(tipo, codigoPersonalizado, obterData("viagem"));
            case 3 -> new Ferroviario(tipo, codigoPersonalizado, obterData("viagem"));
            default -> null;
        };
    }

    public static LocalDate obterData(String modificador) {
        System.out.printf("Qual o ano do seu %s?: ", modificador);
        int ano = Integer.parseInt(sc.nextLine());

        System.out.printf("Qual o mês do seu %s?: ", modificador);
        int mes = Integer.parseInt(sc.nextLine());

        System.out.printf("Qual o dia do seu %s?: ", modificador);
        int dia = Integer.parseInt(sc.nextLine());

        return LocalDate.of(ano, mes, dia);
    }

    public static void main(String[] args) {
        System.out.println("\nBem-vindo ao programa de Fidelidade de Viagens");
        System.out.println("\n\nPor favor, conte-nos um pouco sobre você");
        Passageiro joao = criarPassageiro();
        System.out.println("\nRegistrar suas viagens.");
        System.out.print("Digite quantas viagens você fez neste ano: ");
        int numeroDeViagens = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numeroDeViagens; i++) {
            joao.salvar(criarViagem(i));
        }
        System.out.println("Você acumulou, com suas viagens este ano, " + joao.valorTotal() + " pts");
        System.out.println("Obrigado por usar nosso sistema de fidelidade de viagens!");
    }
}
