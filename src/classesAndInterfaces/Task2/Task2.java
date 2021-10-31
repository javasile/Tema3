package classesAndInterfaces.Task2;

public class Task2 {
    public static void main(String[] args) {
//Movie movie = new Movie("The Dictator", "J.M.", "2000", "Comedy", "NetFlix");
//        System.out.println(movie);

        Movie.MovieCreator movie = new Movie.MovieCreator()
                .setTitle("Pacala")
                .setDirector("Sergiu Nicolaescu")
                .setYearOfRelease("1995")
                .setGenre("Comedy")
                .setDistribuitor("SevenFilms");
        System.out.println(movie);
    }
}

class Movie {
    private String title, director, yearOfRelease, genre, distribuitor;

    public Movie(String title, String director, String yearOfRelease, String genre, String distribuitor) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.genre = genre;
        this.distribuitor = distribuitor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDistribuitor() {
        return distribuitor;
    }

    public void setDistribuitor(String distribuitor) {
        this.distribuitor = distribuitor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yearOfRelease='" + yearOfRelease + '\'' +
                ", genre='" + genre + '\'' +
                ", distribuitor='" + distribuitor + '\'' +
                '}';
    }


    static class MovieCreator {
        private String title, director, yearOfRelease, genre, distribuitor;

        public MovieCreator setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieCreator setDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieCreator setYearOfRelease(String yearOfRelease) {
            this.yearOfRelease = yearOfRelease;
            return this;
        }

        public MovieCreator setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public MovieCreator setDistribuitor(String distribuitor) {
            this.distribuitor = distribuitor;
            return this;
        }


        @Override
        public String toString() {
            return "MovieCreator{" +
                    "title='" + title + '\'' +
                    ", director='" + director + '\'' +
                    ", yearOfRelease='" + yearOfRelease + '\'' +
                    ", genre='" + genre + '\'' +
                    ", distribuitor='" + distribuitor + '\'' +
                    '}';
        }

        public Movie creatorMovie(){
            Movie movie = new Movie(title, director, yearOfRelease, genre, distribuitor);
            return movie;


        }
    }
}

