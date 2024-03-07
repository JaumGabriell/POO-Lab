public class Jogador {
    Arma arma;
    int energia;
    int vida;
    void atacar(Jogador alvo){
        do{
            if(this.energia >= this.arma.custoDeEnergia){
                alvo.vida -= this.arma.dano;
                this.energia -= this.arma.custoDeEnergia;
            }
        }while (alvo.vida <=0);

    }

    Jogador(Arma arma, int vida, int energia){
        this.energia = energia;
        this.vida = vida;
        this.arma = arma;
    }


    public String toString() {
        return "Vida do jogador: " + this.vida + " Energia do jogador: " + this.energia;
    }

}
