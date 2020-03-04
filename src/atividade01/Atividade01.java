package atividade01;

public class Atividade01 {

    public static void main(String[] args) {

        ClientePj cliente01 = new ClientePj("Time Share Soluções", "4343 c/c 45726-5", "49.426.476/0001-88",5000);
        
        cliente01.pagarSalario();
        
        System.out.println("Razão Social: "+cliente01.getRazaoSocial());
        System.out.println("Conta: "+cliente01.getNumeroConta());
        System.out.println("CNPJ: "+cliente01.getCnpj());
        System.out.println("Pagamentos: "+cliente01.getPagamento());
        
    }

}
