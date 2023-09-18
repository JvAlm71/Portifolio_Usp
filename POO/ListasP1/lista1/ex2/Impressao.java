public class Impressao extends Funcionalidades {
    
    private boolean imprimepaginas; 
    
    public void VerificaStatus(){
        System.out.println("Status Verificado!!");
    }

    public void ExecutaTeste(){
        System.out.println("Teste Executado!!");
    }

    public void LigaDispositivo(){
        System.out.println("Dispositivo Ligado!!");
    }

    public Impressao(boolean imprimepaginas) {
        this.imprimepaginas = imprimepaginas;
        imprimepaginas = true;  
    }

    public boolean getImprimepaginas() {
        return imprimepaginas;
    }

    public void setImprimepaginas(boolean imprimepaginas) {
        this.imprimepaginas = imprimepaginas;
    }

}
