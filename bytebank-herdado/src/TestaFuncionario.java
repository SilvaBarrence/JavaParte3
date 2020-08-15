public class TestaFuncionario {
    public static void main(String[] args) {

        Gerente nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("123.456.789-95");

        nico.setSalario(2000.0);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
    }
}
