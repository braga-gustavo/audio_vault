package br.com.audiovault.models;

public class Music extends Audio {

    private String recordLabel;
    private String albumName;
    private String typeOfAuhor; // Band, solo, orchestra, etc.
    private String authorName; // Band, solo, orchestra, etc.
    private Boolean isAlbum; // If the music is in an album or is a single

    public void showInfo() {
        System.out.println("\n***************************************************************\n");
        System.out.println("Informações sobre a musica: " + this.getTitle());
        System.out.println("Autor: " + this.authorName);
        System.out.println("Gravadora: " + this.recordLabel);
        System.out.println("Albúm: " + this.albumName);
        System.out.println("Tipo de autor: " + this.typeOfAuhor);
        System.out.println("Pertence a algum album: " + this.isAlbum);

    }

    public Integer getClassification() {
        if (this.getTimesPlayed() >= 500) {
            return 10;

        } else if (this.getTimesPlayed() > 400) {
            return 8;

        } else {
            return 5;
        }
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public void setRecordLabel(String recordLabel) {
        this.recordLabel = recordLabel;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getTypeOfAuhor() {
        return typeOfAuhor;
    }

    public void setTypeOfAuhor(String typeOfAuhor) {
        this.typeOfAuhor = typeOfAuhor;
    }

    public Boolean getIsAlbum() {
        return isAlbum;
    }

    public void setIsAlbum(Boolean isAlbum) {
        this.isAlbum = isAlbum;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}
