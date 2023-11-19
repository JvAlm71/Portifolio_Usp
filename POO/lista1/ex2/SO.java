public class SO {
        
    public Impressao impressao;
    public Video video;
    public DriverRede driverRede;

    public SO(Impressao impressao, Video video, DriverRede driverRede){
        this.video = video;
        this.impressao = impressao;
        this.driverRede = driverRede;
    }

    public void ImpremeSO(){
        System.out.println("Impressao: " + impressao.getImprimepaginas()+ " Video: " + video.getAlteraBrilho()+ "% DriverRede: " + driverRede.getEnviaPacotesdeDados());
    }
    public void VerificaStatus(){
        System.out.println("Status Verificado!!");
    }
        
    public void ExecutaTeste(){
        System.out.println("Teste Executado!!");
    }
    public void LigaDispositivo(){
        System.out.println("Dispositivo Ligado!!");
    }


}
