package com.Aluno;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cadastro<Aluno> turma1 = new Cadastro<>();
        Cadastro<Aluno> turma2 = new Cadastro<>();
        Cadastro<Aluno> turma3 = new Cadastro<>();
        Cadastro<Aluno> turma4 = new Cadastro<>();
        int op;

        do {
            menu();
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe a matrícula do aluno");
                    String matr = in.next();
                    System.out.println("Informe o nome do aluno");
                    String nome = in.next();
                    Aluno aluno = new Aluno(matr, nome);
                    System.out.println("Informe a turma para inserir o aluno");
                    int exibiTurma = in.nextInt();
                    switch (exibiTurma) {
                        case 1:
                            turma1.cadastrar(aluno);
                            break;
                        case 2:
                            turma2.cadastrar(aluno);
                            break;
                        case 3:
                            turma3.cadastrar(aluno);
                            break;
                        case 4:
                            turma4.cadastrar(aluno);
                            break;
                        default:
                            System.out.println("Turma inválida");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Informe a turma para exibir");
                    int exibirTurma2 = in.nextInt();
                    switch (exibirTurma2) {
                        case 1:
                            turma1.listarCadastros();
                            break;
                        case 2:
                            turma2.listarCadastros();
                            break;
                        case 3:
                            turma3.listarCadastros();
                            break;
                        case 4:
                            turma4.listarCadastros();
                            break;
                        default:
                            System.out.println("Turma inválida");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Informe a turma do aluno");
                    int exibirTurma3 = in.nextInt();
                    switch (exibirTurma3) {
                        case 1:
                            System.out.println("Informe a matrícula do aluno");
                            String matr1 = in.next();
                            Aluno aluno1 = new Aluno(matr1);
                            turma1.alterarMedia(aluno1);
                            break;
                        case 2:
                            System.out.println("Informe a matrícula do aluno");
                            String matr2 = in.next();
                            Aluno aluno2 = new Aluno(matr2);
                            turma2.alterarMedia(aluno2);
                            break;
                        case 3:
                            System.out.println("Informe a matrícula do aluno");
                            String matr3 = in.next();
                            Aluno aluno3 = new Aluno(matr3);
                            turma3.alterarMedia(aluno3);
                            break;
                        case 4:
                            System.out.println("Informe a matrícula do aluno");
                            String matr4 = in.next();
                            Aluno aluno4 = new Aluno(matr4);
                            turma4.alterarMedia(aluno4);
                            break;
                        default:
                            System.out.println("Turma inválida");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Informe a turma do aluno");
                    int exibirTurma4 = in.nextInt();
                    switch (exibirTurma4) {
                        case 1:
                            System.out.println("Informe a matrícula do aluno");
                            String matr1 = in.next();
                            Aluno aluno1 = new Aluno(matr1);
                            turma1.alterarFaltas(aluno1);
                            break;
                        case 2:
                            System.out.println("Informe a matrícula do aluno");
                            String matr2 = in.next();
                            Aluno aluno2 = new Aluno(matr2);
                            turma2.alterarFaltas(aluno2);
                            break;
                        case 3:
                            System.out.println("Informe a matrícula do aluno");
                            String matr3 = in.next();
                            Aluno aluno3 = new Aluno(matr3);
                            turma3.alterarFaltas(aluno3);
                            break;
                        case 4:
                            System.out.println("Informe a matrícula do aluno");
                            String matr4 = in.next();
                            Aluno aluno4 = new Aluno(matr4);
                            turma4.alterarFaltas(aluno4);
                            break;
                        default:
                            System.out.println("Turma inválida");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Informe a turma do aluno");
                    int exibirTurma5 = in.nextInt();
                    switch (exibirTurma5) {
                        case 1:
                            System.out.println("Informe a matrícula do aluno");
                            String matr1 = in.next();
                            Aluno aluno1 = new Aluno(matr1);
                            turma1.dadosAluno(aluno1);
                            break;
                        case 2:
                            System.out.println("Informe a matrícula do aluno");
                            String matr2 = in.next();
                            Aluno aluno2 = new Aluno(matr2);
                            turma2.dadosAluno(aluno2);
                            break;
                        case 3:
                            System.out.println("Informe a matrícula do aluno");
                            String matr3 = in.next();
                            Aluno aluno3 = new Aluno(matr3);
                            turma3.dadosAluno(aluno3);
                            break;
                        case 4:
                            System.out.println("Informe a matrícula do aluno");
                            String matr4 = in.next();
                            Aluno aluno4 = new Aluno(matr4);
                            turma4.dadosAluno(aluno4);
                            break;
                        default:
                            System.out.println("Turma inválida");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Informe a turma do aluno");
                    int exibirTurma6 = in.nextInt();
                    switch (exibirTurma6) {
                        case 1:
                            System.out.println("Informe a matrícula do aluno");
                            String matr1 = in.next();
                            Aluno aluno1 = new Aluno(matr1);
                            turma1.remover(aluno1);
                            break;
                        case 2:
                            System.out.println("Informe a matrícula do aluno");
                            String matr2 = in.next();
                            Aluno aluno2 = new Aluno(matr2);
                            turma2.remover(aluno2);
                            break;
                        case 3:
                            System.out.println("Informe a matrícula do aluno");
                            String matr3 = in.next();
                            Aluno aluno3 = new Aluno(matr3);
                            turma3.remover(aluno3);
                            break;
                        case 4:
                            System.out.println("Informe a matrícula do aluno");
                            String matr4 = in.next();
                            Aluno aluno4 = new Aluno(matr4);
                            turma4.remover(aluno4);
                            break;
                        default:
                            System.out.println("Turma inválida");
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Você saiu");
                    break;
                default:
                    System.out.println("Erro");
                    break;
            }
        } while (op != 0);
    }


    public static void menu(){
        System.out.println("1 - Cadastrar um novo aluno \n" +
                "2 - Listar os cadastros \n" +
                "3 - Alterar a média final de um aluno \n" +
                "4 - Alterar a quantidade de faltas de um aluno \n" +
                "5 - Exibir os dados de um aluno \n" +
                "6 - Remover o cadastro de um aluno \n" +
                "0 - Sair");
    }
}