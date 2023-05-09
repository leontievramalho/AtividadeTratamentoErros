package br.edu.catolica.conversaoDado.Main;

public class StringNull {
    public static void main(String[] args) {
        try{
            String texto = null;
            System.out.println(texto.length());
        } catch(NullPointerException e){
            System.err.println(e);
        }

    }
}
