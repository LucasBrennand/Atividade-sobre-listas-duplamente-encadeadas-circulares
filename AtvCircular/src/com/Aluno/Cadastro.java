package com.Aluno;

import java.util.Scanner;

public class Cadastro <T extends Comparable<T>> {
    private LDECircular<T> listaAlunos;
    public Cadastro() {
        this.listaAlunos = new LDECircular<>();
    }

    public void cadastrar(T valor){
        listaAlunos.inserirOrdenadoCrescenteSemRepetidos(valor);
    }

    public void listarCadastros(){
        listaAlunos.exibirTodos();
    }

    public Aluno consultar (T valor){
        return (Aluno) listaAlunos.buscar(valor).getInfo();
    }

    public void alterarMedia(T valor){
        Scanner in = new Scanner(System.in);
        if (consultar(valor) != null) {
            System.out.println("Insira a média do aluno");
            double media = in.nextDouble();
            consultar(valor).setMediaFinal(media);
            System.out.println("Media do aluno: " + consultar(valor).getMediaFinal());
        }
        else {
            System.out.println("Aluno não encontrado");
        }
    }

    public void alterarFaltas(T valor){
        Scanner in = new Scanner(System.in);
        if (consultar(valor) != null) {
            System.out.println("Insira a quantidade de faltas do aluno");
            int faltas = in.nextInt();
            consultar(valor).setQtdFaltas(faltas);
            System.out.println("Faltas do aluno: " + consultar(valor).getQtdFaltas());
        }
        else {
            System.out.println("Aluno não encontrado");
        }
    }

    public void remover(T valor){
        listaAlunos.remover(valor);
    }

    public void dadosAluno(T valor){
        listaAlunos.exibir(valor);
    }

}
