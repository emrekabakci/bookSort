import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Sofie'nin Dünyası", 550, "Jostein Gaarder", "1991");
        Book book2 = new Book("Küçük Prens", 150, "Antoine de Saint-Exupéry", "1943");
        Book book3 = new Book("Simyacı", 180, "Paulo Coelho", "1988");
        Book book4 = new Book("Uçurtma Avcısı", 375, "Khaled Hosseini", "2003");
        Book book5 = new Book("Bülbülü Öldürmek", 350, "Harper Lee", "1960");

        // Set that sorts books by name
        Set<Book> nameSorting = new TreeSet<>();
        nameSorting.add(book1);
        nameSorting.add(book2);
        nameSorting.add(book3);
        nameSorting.add(book4);
        nameSorting.add(book5);

        System.out.println("**SORT BY BOOK NAME**");
        for (Book book : nameSorting) {
            System.out.println(book);
        }

        // Comparator to sort books by page count
        Comparator<Book> pageCountComparator = Comparator.comparingInt(Book::getPageCount);

        // Set that sorts books by page count
        Set<Book> pageCountSorting = new TreeSet<>(pageCountComparator);
        pageCountSorting.addAll(nameSorting);

        System.out.println("\n**SORT BY PAGE COUNT**");
        for (Book book : pageCountSorting) {
            System.out.println(book);
        }
    }
}
