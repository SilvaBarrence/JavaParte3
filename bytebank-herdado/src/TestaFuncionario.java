public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario nico = new Funcionario();
        nico.setNome("Nico Steppat");
        nico.setCpf("123.456.789-95");
        nico.setSalario(2590.50);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
    }
}
