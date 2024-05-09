public class Item implements Comparable<Item>{
        private int valor;
        private String nome;

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Item(int valor, String nome) {
            this.valor = valor;
            this.nome = nome;
        }

        @Override
        public int compareTo(Item o) {

            return Integer.compare(this.valor, o.getValor()); // crescente
            //return Integer.compare(o.getValor(), this.valor); // decrescente
            //return return this.nome.compareTo(o.getNome()); // alfabetica crescente
            //return return o.nome.compareTo(this.getNome()); // alfabetica decrescente
        }
    }

