/**
 * Represents a novel with a title, author's name, and year published.
 *
 * @author Emma Lee
 * @version 2024
 */
public class Novel
{
    private final String title;
    private final String authorName;
    private final int yearPublished;

    /**
     * Constructs a Novel object with the specified title, author name, and year published.
     *
     * @param title        the title of the novel
     * @param authorName   the name of the author
     * @param yearPublished the year the novel was published
     */
    public Novel(final String title,
                 final String authorName,
                 final int yearPublished)
    {
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    /**
     * Gets the title of the novel.
     *
     * @return the title of the novel
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Gets the name of the author.
     *
     * @return the name of the author
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * Gets the year the novel was published.
     *
     * @return the year the novel was published
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    /**
     * Override of the toString() method to provide a string representation of the Novel object.
     *
     * @return string representation of the Novel object
     */
    @Override
    public String toString()
    {
        return "Novel: " +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }
}
