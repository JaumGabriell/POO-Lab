//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente mark = new Cliente();
        mark.setNome("mark");
        mark.setCpf("222");
        mark.getConta().setSaldo(100);
        mark.getConta().setLimite(200);

        System.out.println(mark.toString());

    }
}