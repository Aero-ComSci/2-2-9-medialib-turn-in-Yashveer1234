public class MediaLib {
    private Book book;
    private Movie movie;
    private Song song;

    private static int numBooks = 0;
    private static int numSongs = 0;
    private static int numMovies = 0;

    public void addBook(Book b) {
        book = b;
        numBooks++;
    }

    public void addSong(Song s) {
        song = s;
        numSongs++;
    }

    public void addMovie(Movie m) {
        movie = m;
        numMovies++;
    }

    public Book getBook() {
        return book;
    }

    public int getNumBooks() {
        return numBooks;
    }

    public int getNumSongs() {
        return numSongs;
    }

    public int getNumMovies() {
        return numMovies;
    }

    public int getNumEntries() {
        return numBooks + numSongs + numMovies;
    }

    public String toString() {
        return "Library contains " + getNumEntries() + " entries.";
    }
}
