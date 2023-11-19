public class DriverRede {

    private boolean enviaPacotesdeDados;

    public void VerificaStatus(){
        System.out.println("Status Verificado!!");
    }

    public void ExecutaTeste(){
        System.out.println("Teste Executado!!");
    }

    public void LigaDispositivo(){
        System.out.println("Dispositivo Ligado!!");
    }

    public DriverRede(boolean enviaPacotesdeDados) {
        this.enviaPacotesdeDados = enviaPacotesdeDados;
    }

    public DriverRede() {
        enviaPacotesdeDados = true;
    }


    //get e set
    public boolean getEnviaPacotesdeDados() { return enviaPacotesdeDados; }
    public void setEnviaPacotesdeDados(boolean enviaPacotesdeDados) {this.enviaPacotesdeDados = enviaPacotesdeDados;}
}
