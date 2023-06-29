package br.com.audiovault.models;

public class Audio {

    private String title;
    private Integer durationInMinutes;
    private Integer timesPlayed;
    private Integer totalLikes;
    private Integer classification;

    public void showInfo() {
        System.out.println(this.title);
        System.out.println(this.durationInMinutes);
        System.out.println(this.timesPlayed);
        System.out.println(this.totalLikes);
        System.out.println(this.classification);
        System.out.println(this.totalLikes);
    }

    public void liked() {
        totalLikes = 0;
        this.totalLikes++;
    }

    public void played() {
        timesPlayed = 0;
        this.timesPlayed++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTimesPlayed() {
        return timesPlayed;
    }

    public Integer getTotalLikes() {
        return totalLikes;
    }

    public Integer getClassification() {
        return classification;
    }

    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

}
