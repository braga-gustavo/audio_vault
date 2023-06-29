package br.com.audiovault;

import br.com.audiovault.models.Favorites;
import br.com.audiovault.models.Music;
import br.com.audiovault.models.Podcast;

public class App {

    public static void main(String[] args) {

        Music music1 = new Music();
        Podcast podcast1 = new Podcast();
        Favorites favorites = new Favorites();
        
        music1.setTitle("Fade to black");
        music1.setAlbumName("Ride the Lightning");
        music1.setAuthorName("Metallica");
        music1.setTypeOfAuhor("Banda");
        music1.setDurationInMinutes(7);
        music1.setRecordLabel("Blackend Records");
        music1.setIsAlbum(true);
        music1.played();
        music1.liked();
        music1.showInfo();
        favorites.add(music1);

        podcast1.setTitle("Vida e obra JRR Tolkien");
        podcast1.setDescription("Podcast contando sobre a vida do pai da literatura fantastica");
        podcast1.setDurationInMinutes(145);
        podcast1.setHostingPlataform("Youtube");
        podcast1.setHost("Ronald Krymse");
        podcast1.played();
        podcast1.liked();
        podcast1.showInfo();
        favorites.add(podcast1);

        
        
        
        
        
    }
    
}
