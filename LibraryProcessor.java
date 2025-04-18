import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LibraryProcessor {
    static class Book {
        String title;
        String author;
        int year;
        String genre;
        double price;

        Book(String title, String author, int year, String genre, double price) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.genre = genre;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        double total = 0;
        System.out.printf("\nКниги:\n");
        try {
            File inputFile = new File("library.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("book");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    String title = eElement.getElementsByTagName("title").item(0).getTextContent();
                    String author = eElement.getElementsByTagName("author").item(0).getTextContent();
                    int year = Integer.parseInt(eElement.getElementsByTagName("year").item(0).getTextContent());
                    String genre = eElement.getElementsByTagName("genre").item(0).getTextContent();
                    double price = Double.parseDouble(eElement.getElementsByTagName("price").item(0).getTextContent());

                    books.add(new Book(title, author, year, genre, price));
                    total += price;

                    System.out.println(title + ", " + author + ", " + year + ", " + genre + ", " + price);
                }
            }

            System.out.printf("\nСредняя цена: %.2f\n", total / books.size());

            // Пример фильтрации по жанру
            String genreFilter = "Фантастика";
            System.out.println("\nКниги жанра " + genreFilter + ":");
            for (Book book : books) {
                if (book.genre.equals(genreFilter)) {
                    System.out.println(book.title);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
