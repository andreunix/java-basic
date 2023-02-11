package com.andreunix.basic;

public class TiposVariaveis {
  public static void main(String[] args) {
    byte idade = 21;
    short ano = 2023;
    int cep = 7680000;  // se começar com zero, talvez tenha que ser outro tipo
    long cpf = 92937473830L; // se começar com zero, talvez tenha que ser outro tipo
    float pi = 3.14F;
    double salario = 1500.34;

    final double PI = 3.14;

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short) numeroNormal;
  }
}
