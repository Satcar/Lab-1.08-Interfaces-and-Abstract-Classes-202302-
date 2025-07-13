package streaming_service;

public abstract class Video {
    //ATRIBUTOS
    private final String title;
    private final int duration;

    //CONSTRUCTOR

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }


    //GETTERS Y SETTERS

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    //METODOS

    String getInfo() {
        return String.format(
                """
                        ***Propiedades del video***
                        Titulo: %s
                        Duracion (minutos): %s""",
                getTitle(), getDuration()
        );
    }

}
