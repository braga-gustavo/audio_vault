package br.com.audiovault.models;

public class Favorites {

    public void add(Audio audio){
        if(audio.getClassification() >= 9 ){
            System.out.println(audio.getTitle() + " é um sucesso absoluto");
        }else{
            System.out.println(audio.getTitle() + " é curtido por todos");
        }
    }
    
}
