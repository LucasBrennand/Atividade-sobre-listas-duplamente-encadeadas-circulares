package com.Aluno;

import java.util.Scanner;

public class LDECircular<T extends Comparable<T>> {
    private LDENode<T> prim;
    private LDENode<T> ult;
    private int qtd;

    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void exibirTodos() {
        LDENode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista Vazia");
        } else {
            aux = this.prim;
            do {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
            } while (aux != this.ult.getProx());
        }
        System.out.println();
    }

    public void exibir(T valor) {
        LDENode<T> aux = this.buscar(valor);
        if (this.isEmpty() == true) {
            System.out.println("Lista Vazia");
        }
        else if (aux != null) {
            System.out.println(aux.getInfo());
        }
        else {
            System.out.println("Aluno não encontrado");
        }
    }

    public LDENode<T> buscar(T valor) {
        LDENode<T> aux = this.prim;
        if (this.isEmpty() == true) {
            System.out.println("Lista está vazia");
            return null;
        }
        if (valor.compareTo(this.ult.getInfo()) == 0) {
            return this.ult;
        }
        else if (valor.compareTo(this.ult.getInfo()) > 0) {
            return null;
        }
        else {
            aux = this.prim;
            while (aux.getProx() != null) {
                if (aux.getInfo().compareTo(valor) == 0) {
                    return aux;
                } else if (valor.compareTo(aux.getInfo()) > 0) {
                    aux = aux.getProx();
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    public void inserirOrdenadoCrescenteSemRepetidos (T valor) {
        LDENode<T> novo = new LDENode(valor);
        LDENode<T> aux, anterior;
        if (this.isEmpty() == true) { // inserir na lista vazia
            this.prim = novo;
            this.ult = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        }
        else if (valor.compareTo(this.prim.getInfo()) == 0) {
            System.out.println("Valor repetido. Inserção não efetuada!");
        }
        else if (valor.compareTo(this.prim.getInfo()) < 0) { // inserir antes do primeiro
            novo.setProx(this.prim);
            this.prim.setAnt(novo);
            this.prim = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        }
        else if (valor.compareTo(this.ult.getInfo()) == 0) {
            System.out.println("Valor repetido. Inserção não efetuada!");
        }
        else if (valor.compareTo(this.ult.getInfo()) > 0) { // inserir depois do último
            this.ult.setProx(novo);
            novo.setAnt(this.ult);
            this.ult = novo;
            this.qtd++;
            this.prim.setAnt(this.ult);
            this.ult.setProx(this.prim);
        }
        else {
            aux = this.prim.getProx();
            while (true){
                if (valor.compareTo(aux.getInfo()) == 0) {
                    System.out.println("Valor repetido. Inserção não efetuada!");
                    break;
                }
                else if (valor.compareTo(aux.getInfo()) < 0) { // achei local de inserção
                    anterior = aux.getAnt();
                    anterior.setProx(novo);
                    aux.setAnt(novo);
                    novo.setProx(aux);
                    novo.setAnt(anterior);
                    this.prim.setAnt(this.ult);
                    this.ult.setProx(this.prim);
                    this.qtd++;
                    break;
                }
                else {
                    aux = aux.getProx();
                }
            }
        }
    }

    public void remover (T valor) {
        LDENode<T> aux, anterior, proximo;
        if (this.isEmpty() == true){
            System.out.println("Lista vazia");
        }
        else if (this.qtd == 1) {
            if (valor.compareTo (this.prim.getInfo()) == 0) {
                this.prim = null;
                this.ult = null;
                this.qtd--;
            }
            else {
                System.out.println("Valor não encontrado");
            }
        }
        else {
            aux = this.buscar(valor);
            if (aux != null) {
                anterior = aux.getAnt();
                proximo = aux.getProx();
                anterior.setProx(proximo);
                proximo.setAnt(anterior);
                this.qtd--;
                if (aux == this.prim) {
                    this.prim = proximo;
                }
                else if (aux == this.ult) {
                    this.ult = anterior;
                }
            }
            else {
                System.out.println("Valor não encontrado");
            }
        }
    }


}