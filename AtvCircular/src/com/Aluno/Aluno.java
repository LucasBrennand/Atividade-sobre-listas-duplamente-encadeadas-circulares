package com.Aluno;

public class Aluno implements Comparable<Aluno> {
    // Atributos
    private String matr;
    private String nome;
    private double mediaFinal;
    private int qtdFaltas;

    public Aluno (String matr, String nome) {
        this.matr = matr;
        this.nome = nome;
    }

    public Aluno(String matr) {
        this.matr = matr;
    }

    public String getMatr () {
        return this.matr;
    }
    public String getNome () {
        return this.nome;
    }

    public void setMatr (String matr) {
        this.matr = matr;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public int getQtdFaltas() {
        return qtdFaltas;
    }

    public void setQtdFaltas(int qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }

    public int compareTo (Aluno al) {
        int result;
        result = this.getMatr().compareTo(al.getMatr());
        return result;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matr='" + matr + '\'' +
                ", nome='" + nome + '\'' +
                ", mediaFinal='" + mediaFinal + '\'' +
                ", qtdFaltas='" + qtdFaltas + '\'' +
                '}';
    }
}
