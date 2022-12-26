public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Название книги1", "Фамилия Отчество1");
        books[1] = new Book("Название книги2", "Фамилия Отчество2");
        books[2] = new Book("Название книги3", "Фамилия Отчество3");
        books[3] = new Book("Название книги4", "Фамилия Отчество4");

        for (Book i : books) {
            System.out.println(i);
        }


    }

}