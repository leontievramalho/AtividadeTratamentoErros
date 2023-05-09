package br.edu.catolica.conversaoDado.Main;

public class Conversao {
    public static void main(String[] args) {
        Object obj = new Integer(10);
        try {
            String str = (String) obj;
            System.out.println(str);
        }
            catch(ClassCastException e){
                System.err.println(e);
            }
    }

}
