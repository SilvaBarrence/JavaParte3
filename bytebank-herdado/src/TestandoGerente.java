public class TestandoGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Gabriel");
        g1.setCpf("45592903855");
        g1.setSalario(3000.00);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(123456);
        boolean autentica = g1.autentica(123456);
        System.out.println(autentica);
    }
}
