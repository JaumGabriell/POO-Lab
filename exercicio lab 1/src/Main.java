//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(fatorial(9));
        mostraPares(23);


        }
        public static int fatorial(int n){ // pode criar a função em qualquer lugar dentro da main
        int fat = 1;
        for (int i = 1; i <= n; i++)
        {
            fat *= i;

        }
        return fat;

        }

        public static void mostraPares(int n){
        for (int i = 0; i <= n; i++)
            if(i%2 == 0)
                System.out.println(i);
        }
    }
