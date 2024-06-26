public class NavegadorInternet {

    private String url;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void exibirPagina(String url){
        System.out.println("exibindo a pagina: "+ url );
    }
    
    public void adicionarNovaAba(){
        System.out.println("nova aba aberta...");
    }
    public void atualizarPagina(){
        System.out.println("pagina atualizada...");
        
    }

}


