public class MediaLibRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to your Media Library");
        MediaLib myLib = new MediaLib();

        Book myBook = new Book("The Lord of the Rings", "Tolkien");
        myLib.addBook(myBook);
        
        System.out.println("Book created " + myBook);
        System.out.println("Library:\n" + myLib);

        int myRating = 5;
        myBook.adjustRating(myRating);

        Book newBook2 = new Book("The Lord of the Rings", "Tolkien");
        System.out.println("Books are equal: " + myBook.equals(newBook2));
    }
}
