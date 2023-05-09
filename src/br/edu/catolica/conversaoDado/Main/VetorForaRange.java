package br.edu.catolica.conversaoDado.Main;

public class VetorForaRange {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
    }
}
