package CalculadoraPOO;

public class Calculadora {

    private Double soma;
    private Double subtracao;
    private Double multiplicacao;
    private Double divisao;
    private Double potencia;
    private Double raiz;

public Double getSoma(){
    return soma;
}
public void setSoma(Double n1, Double n2){
    
    Double soma = n1 + n2;
    System.out.println(n1 + " + " + n2 + " = " + soma);
}

public Double getSubtracao(){
    return subtracao;
}
public void setSubtracao(Double n1, Double n2){

    Double subtracao = n1 - n2;
    System.out.println(n1 + " - " + n2 + " = " + subtracao);
}

public Double getMultiplicacao(){
    return multiplicacao;
}
public void setMultiplicacao(Double n1, Double n2){

    Double multiplicacao = n1 * n2;
    System.out.println(n1 + " X " + n2 + " = " + multiplicacao);
}

public Double getDivisao(){
    return divisao;
}
public void setDivisao(Double n1, Double n2){

    Double divisao =  n1 / n2;
    System.out.println(n1 + " / " + n2 + " = " + divisao);
}


public Double getPotencia(){
    return potencia;
}
public void setPotencia(Double n1, Double n2){

    Double potencia = Math.pow(n1, n2);
    System.out.println(n1 + " ^ " + n2 + " = " + potencia);
}

public Double getRaiz(){
    return raiz;
}
public void setRaiz(Double n1){

    Double raiz = Math.sqrt(n1);
    System.out.println("Raiz de " + n1 + " = " + raiz);
}


    
}
