public class Video {
    
    private int AlteraBrilho;

    public void VerificaStatus(){
        System.out.println("Status Verificado!!");
    }

    public void ExecutaTeste(){
        System.out.println("Teste Executado!!");
    }

    public void LigaDispositivo(){
        System.out.println("Dispositivo Ligado!!");
    }

    public Video(int AlteraBrilho) {
        this.AlteraBrilho = AlteraBrilho;
        AlteraBrilho = 90;
    }

    public int getAlteraBrilho() {
        return AlteraBrilho;
    }

    public void setAlteraBrilho(int AlteraBrilho) {
        this.AlteraBrilho = AlteraBrilho;
    }
}
