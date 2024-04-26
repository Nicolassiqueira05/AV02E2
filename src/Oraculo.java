import java.lang.Math;

public class Oraculo{
    String oraculoNome = "Aladeen";
    Guerreiro guerreiro;
    public Oraculo(){
        SoundPlayer soundPlayer = new SoundPlayer();
        soundPlayer.playSound("OP.wav");
        guerreiro = new Guerreiro(prologo());
        int r = prologo2();
        if(r == 1){
            explicação();
        }else{
            derrota();
        }
        guerreiro.setVidas(sortearVidas());
        mostraVidas();
        fases(0, 0);

    }
    public int sortearVidas(){
        int random = (int)(Math.random() * 4) + 9;
        return random;
    }
    public String prologo(){
        String nome = InOut.leString("Olá guerreiro solitário, meu nome é Vinicius Aladeen, sou um oráculo de poder imensurável, me diga seu nome:");
        return nome;
    }
    public int prologo2(){
        String resposta= InOut.leString("Pretendo destruir todo seu mundo, mas antes gostaria de lhe propor um jogo, você aceita?");
        int resultado;
        if(resposta.toLowerCase().equals("sim")){
            resultado = 1;
        }else{
            resultado = 0;
        }
        return resultado;
    }
    public void explicação(){
        InOut.MsgDeInformacao("Regras", "Você terá que adivinhar meus números, porém se suas vidas se esgotarem, eu destruo seu planeta");
    }
    public void mostraVidas(){
        InOut.MsgDeInformacao("Vidas","Você tem " + guerreiro.vidas + " vidas sobrando");
    }
    public void fases(int i, int num){
        int numero;
        if(num != 0){
            numero = num;
        }else{
            numero = (int)(Math.random() * 99) + 1;
        }
        if(guerreiro.vidas == 0){
            derrota();
        }else if(guerreiro.vitorias == 8){
            vitoria();
        }else{
            int tentativa = InOut.leInt("Qual número estou pensando?");
            if(tentativa == numero){
                InOut.MsgDeInformacao("passou", "Você acertou e recuperou 3 vidas");
                guerreiro.vitorias++;
                guerreiro.vidas += 6;
                fases(i + 1, 0);
            }else if(tentativa > numero){
                InOut.MsgDeInformacao("perdeu", "O número que eu pensei é menor");
                guerreiro.vidas--;
                mostraVidas();
                fases(i, numero);
            } else if (tentativa < numero){
                InOut.MsgDeInformacao("perdeu", "O número que eu pensei é maior");
                guerreiro.vidas--;
                mostraVidas();
                fases(i, numero);
            }
        }
    }

    private void vitoria() {
        InOut.MsgDeInformacao("Vitória", "Graças a seus esforços o oráculo se foi");
    }

    private void derrota() {
        InOut.MsgDeInformacao("Derrota", "Você é um fracasso, e a terra será destruida por sua culpa");
    }
}
