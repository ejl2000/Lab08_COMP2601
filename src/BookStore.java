import java.util.*;
import java.util.stream.Collectors;

/**
 * Represents a bookstore that holds a collection of novels.
 *
 *  @author Emma Lee, Walter Chu
 *  @version 2024
 */
public class BookStore
{
    private final String name;
    private final List<Novel> novels;

    private static final int DECADE_RANGE = 10;
    private static final int PERCENTAGE_CONSTANT = 100;

    /**
     * Constructs a BookStore object with the specified name and populates it with a list of novels.
     *
     * @param name the name of the bookstore
     */
    public BookStore(final String name)
    {
        this.name = name;
        this.novels = new ArrayList<>(Arrays.asList(
                new Novel("The Adventures of Augie March", "Saul Bellow", 1953),
                new Novel("All the King’s Men", "Robert Penn Warren", 1946),
                new Novel("American Pastoral", "Philip Roth", 1997),
                new Novel("An American Tragedy", "Theodore Dreiser", 1925),
                new Novel("Animal Farm", "George Orwell", 1946),
                new Novel("Appointment in Samarra", "John O'Hara", 1934),
                new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970),
                new Novel("The Assistant", "Bernard Malamud", 1957),
                new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938),
                new Novel("Atonement", "Ian McEwan", 2002),
                new Novel("Beloved", "Toni Morrison", 1987),
                new Novel("The Berlin Stories", "Christopher Isherwood", 1946),
                new Novel("The Big Sleep", "Raymond Chandler", 1939),
                new Novel("The Blind Assassin", "Margaret Atwood", 2000),
                new Novel("Blood Meridian", "Cormac McCarthy", 1986),
                new Novel("Brideshead Revisited", "Evelyn Waugh", 1946),
                new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927),
                new Novel("Call It Sleep", "Henry Roth", 1935),
                new Novel("Catch-22", "Joseph Heller", 1961),
                new Novel("The Catcher in the Rye", "J.D. Salinger", 1951),
                new Novel("A Clockwork Orange", "Anthony Burgess", 1963),
                new Novel("The Confessions of Nat Turner", "William Styron", 1967),
                new Novel("The Corrections", "Jonathan Franzen", 2001),
                new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966),
                new Novel("A Dance to the Music of Time", "Anthony Powell", 1951),
                new Novel("The Day of the Locust", "Nathanael West", 1939),
                new Novel("Death Comes for the Archbishop", "Willa Cather", 1927),
                new Novel("A Death in the Family", "James Agee", 1958),
                new Novel("The Death of the Heart", "Elizabeth Bowen", 1958),
                new Novel("Deliverance", "James Dickey", 1970),
                new Novel("Dog Soldiers", "Robert Stone", 1974),
                new Novel("Falconer", "John Cheever", 1977),
                new Novel("The French Lieutenant's Woman", "John Fowles", 1969),
                new Novel("The Golden Notebook", "Doris Lessing", 1962),
                new Novel("Go Tell It on the Mountain", "James Baldwin", 1953),
                new Novel("Gone with the Wind", "Margaret Mitchell", 1936),
                new Novel("The Grapes of Wrath", "John Steinbeck", 1939),
                new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973),
                new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925),
                new Novel("A Handful of Dust", "Evelyn Waugh", 1934),
                new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940),
                new Novel("The Heart of the Matter", "Graham Greene", 1948),
                new Novel("Herzog", "Saul Bellow", 1964),
                new Novel("Housekeeping", "Marilynne Robinson", 1981),
                new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962),
                new Novel("I, Claudius", "Robert Graves", 1934),
                new Novel("Infinite Jest", "David Foster Wallace", 1996),
                new Novel("Invisible Man", "Ralph Ellison", 1952),
                new Novel("Light in August", "William Faulkner", 1932),
                new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950),
                new Novel("Lolita", "Vladimir Nabokov", 1955),
                new Novel("Lord of the Flies", "William Golding", 1954),
                new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954),
                new Novel("Loving", "Henry Green", 1945),
                new Novel("Lucky Jim", "Kingsley Amis", 1954),
                new Novel("The Man Who Loved Children", "Christina Stead", 1940),
                new Novel("Midnight's Children", "Salman Rushdie", 1981),
                new Novel("Money", "Martin Amis", 1984),
                new Novel("The Moviegoer", "Walker Percy", 1961),
                new Novel("Mrs. Dalloway", "Virginia Woolf", 1925),
                new Novel("Naked Lunch", "William Burroughs", 1959),
                new Novel("Native Son", "Richard Wright", 1940),
                new Novel("Neuromancer", "William Gibson", 1984),
                new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005),
                new Novel("1984", "George Orwell", 1948),
                new Novel("On the Road", "Jack Kerouac", 1957),
                new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962),
                new Novel("The Painted Bird", "Jerzy Kosinski", 1965),
                new Novel("Pale Fire", "Vladimir Nabokov", 1962),
                new Novel("A Passage to India", "E.M. Forster", 1924),
                new Novel("Play It as It Lays", "Joan Didion", 1970),
                new Novel("Portnoy's Complaint", "Philip Roth", 1969),
                new Novel("Possession", "A.S. Byatt", 1990),
                new Novel("The Power and the Glory", "Graham Greene", 1939),
                new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961),
                new Novel("Rabbit, Run", "John Updike", 1960),
                new Novel("Ragtime", "E.L. Doctorow", 1975),
                new Novel("The Recognitions", "William Gaddis", 1955),
                new Novel("Red Harvest", "Dashiell Hammett", 1929),
                new Novel("Revolutionary Road", "Richard Yates", 1961),
                new Novel("The Sheltering Sky", "Paul Bowles", 1949),
                new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969),
                new Novel("Snow Crash", "Neal Stephenson", 1992),
                new Novel("The Sot-Weed Factor", "John Barth", 1960),
                new Novel("The Sound and the Fury", "William Faulkner", 1929),
                new Novel("The Sportswriter", "Richard Ford", 1986),
                new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964),
                new Novel("The Sun Also Rises", "Ernest Hemingway", 1926),
                new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937),
                new Novel("Things Fall Apart", "Chinua Achebe", 1958),
                new Novel("To Kill a Mockingbird", "Harper Lee", 1960),
                new Novel("To the Lighthouse", "Virginia Woolf", 1927),
                new Novel("Tropic of Cancer", "Henry Miller", 1934),
                new Novel("Ubik", "Philip K. Dick", 1969),
                new Novel("Under the Net", "Iris Murdoch", 1954),
                new Novel("Under the Volcano", "Malcolm Lowry", 1947),
                new Novel("Watchmen", "Alan Moore", 1986),
                new Novel("White Noise", "Don DeLillo", 1985),
                new Novel("White Teeth", "Zadie Smith", 2000),
                new Novel("Wide Sargasso Sea", "Jean Rhys", 1966)
        ));
    }

    /**
     * Prints all novel titles in uppercase.
     */
    public void printAllTitles()
    {
        novels.stream()
                .map(novel -> novel.getTitle().toUpperCase())
                .forEach(System.out::println);
    }

    /**
     * Prints all novel titles that contain a specified keyword.
     *
     * @param keyword the keyword to search for in titles
     */
    public void printBookTitle(final String keyword)
    {
        novels.stream()
                .filter(novel -> novel.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .forEach(novel -> System.out.println(novel.getTitle()));
    }

    /**
     * Prints all novel titles in alphabetical order.
     */
    public void printTitlesInAlphaOrder()
    {
        novels.stream()
                .map(Novel::getTitle)
                .sorted()
                .forEach(System.out::println);
    }

    /**
     * Prints all novels from a specified decade.
     *
     * @param decade the starting year of the decade
     */
    public void printGroupByDecade(final int decade)
    {
        novels.stream()
                .filter(novel -> novel.getYearPublished() >= decade && novel.getYearPublished() < decade + DECADE_RANGE)
                .forEach(novel -> System.out.println(novel.getTitle() + " by " + novel.getAuthorName()));
    }

    /**
     * Prints the longest novel title.
     */
    public void getLongest()
    {
        novels.stream()
                .max(Comparator.comparingInt(novel -> novel.getTitle().length()))
                .ifPresent(novel -> System.out.println(novel.getTitle()));
    }

    /**
     * Checks if there is a book written in a specified year.
     *
     * @param year the year to check for
     * @return true if there is a book written in the specified year, false otherwise
     */
    public boolean isThereABookWrittenBetween(final int year)
    {
        return novels.stream().anyMatch(novel -> novel.getYearPublished() == year);
    }

    /**
     * Counts how many books contain a specified keyword in their titles.
     *
     * @param keyword the keyword to search for in titles
     * @return the number of books containing the keyword in their titles
     */
    public long howManyBooksContain(final String keyword)
    {
        return novels.stream()
                .filter(novel -> novel.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .count();
    }

    /**
     * Calculates the percentage of books written between two specified years.
     *
     * @param startYear the starting year of the range
     * @param endYear the ending year of the range
     * @return the percentage of books written between the specified years
     */
    public double whichPercentWrittenBetween(final int startYear,
                                             final int endYear)
    {
        final long totalBooks;
        final long booksInRange;

        totalBooks = novels.size();
        booksInRange = novels.stream()
                .filter(novel -> novel.getYearPublished() >= startYear && novel.getYearPublished() <= endYear)
                .count();
        return ((double) booksInRange / totalBooks) * PERCENTAGE_CONSTANT;
    }

    /**
     * Returns the oldest book in the collection.
     *
     * @return the oldest book
     */
    public Novel getOldestBook()
    {
        return novels.stream()
                .min(Comparator.comparingInt(Novel::getYearPublished))
                .orElse(null);
    }

    /**
     * Returns a list of books with titles of a specified length.
     *
     * @param length the length of the titles to search for
     * @return a list of books with titles of the specified length
     */
    public List<Novel> getBooksThisLength(final int length)
    {
        return novels.stream()
                .filter(novel -> novel.getTitle().length() == length)
                .collect(Collectors.toList());
    }

    /**
     * Main method to demonstrate the functionality of the BookStore class.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args)
    {
        final BookStore bookstore;

        bookstore = new BookStore("Classic Novels Collection");

        System.out.println("All Titles in UPPERCASE:");
        bookstore.printAllTitles();

        System.out.println("\nBook Titles Containing 'the':");
        bookstore.printBookTitle("the");

        System.out.println("\nAll Titles in Alphabetical Order:");
        bookstore.printTitlesInAlphaOrder();

        System.out.println("\nBooks from the 2000s:");
        bookstore.printGroupByDecade(2000);

        System.out.println("\nLongest Book Title:");
        bookstore.getLongest();

        System.out.println("\nIs there a book written in 1950?");
        System.out.println(bookstore.isThereABookWrittenBetween(1950));

        System.out.println("\nHow many books contain 'heart'?");
        System.out.println(bookstore.howManyBooksContain("heart"));

        System.out.println("\nPercentage of books written between 1940 and 1950:");
        System.out.println(bookstore.whichPercentWrittenBetween(1940, 1950) + "%");

        System.out.println("\nOldest book:");
        Novel oldest = bookstore.getOldestBook();

        if (oldest != null)
        {
            System.out.println(oldest.getTitle() + " by " + oldest.getAuthorName() + ", " + oldest.getYearPublished());
        }

        System.out.println("\nBooks with titles 15 characters long:");

        List<Novel> fifteenCharTitles;

        fifteenCharTitles= bookstore.getBooksThisLength(15);
        fifteenCharTitles.forEach(novel -> System.out.println(novel.getTitle()));
    }
}
