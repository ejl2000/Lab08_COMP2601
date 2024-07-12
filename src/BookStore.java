import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Represents a bookstore that holds a collection of novels.
 *
 * @author Emma Lee
 * @version 2024
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
                new Novel("Play It As It Lays", "Joan Didion", 1970),
                new Novel("Portnoy's Complaint", "Philip Roth", 1969),
                new Novel("Possession", "A.S. Byatt", 1990),
                new Novel("The Power and the Glory", "Graham Greene", 1940),
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
                new Novel("The Spy Who Came in from the Cold", "John le Carre", 1963),
                new Novel("The Sun Also Rises", "Ernest Hemingway", 1926),
                new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937),
                new Novel("Things Fall Apart", "Chinua Achebe", 1958),
                new Novel("To Kill a Mockingbird", "Harper Lee", 1960),
                new Novel("Tropic of Cancer", "Henry Miller", 1934),
                new Novel("Ubik", "Philip K. Dick", 1969),
                new Novel("Under the Net", "Iris Murdoch", 1954),
                new Novel("Under the Volcano", "Malcolm Lowry", 1947),
                new Novel("Watchmen", "Alan Moore", 1987),
                new Novel("White Noise", "Don DeLillo", 1985),
                new Novel("Wide Sargasso Sea", "Jean Rhys", 1966),
                new Novel("The Wind-Up Bird Chronicle", "Haruki Murakami", 1994),
                new Novel("Wise Blood", "Flannery O'Connor", 1952),
                new Novel("A Wizard of Earthsea", "Ursula K. Le Guin", 1968),
                new Novel("Wuthering Heights", "Emily Bronte", 1847)
        ));
    }

    /**
     * Prints all titles containing the substring in reverse alphabetical order.
     *
     * @param substring the substring to search for in titles
     */
    public void printTitlesContaining(final String substring)
    {
        novels.stream()
                .filter(novel -> novel.getTitle().toLowerCase().contains(substring.toLowerCase()))
                .map(Novel::getTitle)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    /**
     * Returns the shortest title starting with the specified substring.
     *
     * @param substring the substring to search for at the beginning of titles
     * @return the shortest title starting with the specified substring
     */
    public String getShortestTitleStartingWith(final String substring)
    {
        return novels.stream()
                .filter(novel -> novel.getTitle().toLowerCase().startsWith(substring.toLowerCase()))
                .min(Comparator.comparingInt(novel -> novel.getTitle().length()))
                .map(Novel::getTitle)
                .orElse("No matching title found");
    }

    /**
     * Returns an array of novel references where titles contain a space.
     *
     * @return an array of novel references with titles containing a space
     */
    public Novel[] getAllNovelsWithSpaceInTitle()
    {
        return novels.stream()
                .filter(novel -> novel.getTitle().contains(" "))
                .toArray(Novel[]::new);
    }

    /**
     * Returns an ArrayList of author names who published a novel between firstYear and lastYear (inclusive).
     *
     * @param firstYear the starting year of publication
     * @param lastYear  the ending year of publication
     * @return an ArrayList of author names who published novels within the specified year range
     */
    public ArrayList<String> getAllAuthorsWhoPublishedBetween(final int firstYear,
                                                              final int lastYear)
    {
        return novels.stream()
                .filter(novel -> novel.getYearPublished() >= firstYear && novel.getYearPublished() <= lastYear)
                .map(Novel::getAuthorName)
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * Main method to demonstrate the functionality of the BookStore class.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(final String[] args)
    {
        final BookStore bookstore;
        bookstore = new BookStore("Book Emporium");

        // Print titles containing "the" in reverse alphabetical order
        System.out.println("Titles containing 'the' in reverse alphabetical order:");
        bookstore.printTitlesContaining("the");
        System.out.println();

        // Get shortest title starting with "the"
        System.out.println("Shortest title starting with 'the':");
        String shortestTitle = bookstore.getShortestTitleStartingWith("the");
        System.out.println(shortestTitle);
        System.out.println();

        // Get all novels with space in title
        System.out.println("Novels with space in title:");
        Novel[] novelsWithSpace = bookstore.getAllNovelsWithSpaceInTitle();
        for (final Novel novel : novelsWithSpace)
        {
            System.out.println(novel);
        }
        System.out.println();

        // Get all authors who published between 1950 and 1960
        System.out.println("Authors who published between 1950 and 1960:");
        ArrayList<String> authors = bookstore.getAllAuthorsWhoPublishedBetween(1950, 1960);
        for (final String author : authors)
        {
            System.out.println(author);
        }
    }
}
