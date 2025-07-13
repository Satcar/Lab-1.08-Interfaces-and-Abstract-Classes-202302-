package streaming_service;

public class TvSeries extends Video{

    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }


    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    String getInfo() {
        return super.getInfo() + String.format("\nNumero de episodios: %d", getEpisodes());
    }
}