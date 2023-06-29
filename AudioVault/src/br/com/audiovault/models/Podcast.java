package br.com.audiovault.models;

public class Podcast extends Audio  {

    private String host;
    private String hostingPlataform;
    private String description;

    public void showInfo() {
        System.out.println("\n***************************************************************\n");
        System.out.println("Informações sobre o podacast: " + this.getTitle());
        System.out.println("Apresentador(a): " + this.host);
        System.out.println("Plataforma de publicação: " + this.hostingPlataform);
        System.out.println("Desrição: " + this.description);

    }

    public Integer getClassification() {
        if (this.getTotalLikes() >= 5000) {
            return 10;

        } else if(this.getTotalLikes() > 4000){
            return 8;

        }else {
            return 5;
        }

    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getHostingPlataform() {
        return hostingPlataform;
    }

    public void setHostingPlataform(String hostingPlataform) {
        this.hostingPlataform = hostingPlataform;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
