public class exercicio2Mensagem {

    public static void main(String[] args) {

        obterMensagem(6);
        obterMensagem(16);
        obterMensagem(22);

    }

    public static void obterMensagem(int hora) {

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                mensagemBomDia();
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 00:
            case 01:
            case 02:
            case 03:
            case 04:
                mensagemBoaNoite();
                break;
        }

    }

    public static void mensagemBomDia() {
        System.out.println("Bom Dia!");
    }
    public static void mensagemBoaTarde() {
        System.out.println("Boa Tarde!");
    }
    public static void mensagemBoaNoite() {
        System.out.println("Boa Noite!");
    }


}
