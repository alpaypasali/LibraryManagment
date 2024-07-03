import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id" , columnDefinition = "serial")
    private  int id;

    @Column(name = "author_name" , nullable = false)
    private String authorName;

    @Column(name = "author_birthDate" , nullable = false)
    private  int authorBirthDate;

    @Column(name = "author_country" , nullable = false)
    private String authorCountry;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;

    public Author() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getAuthorBirthDate() {
        return authorBirthDate;
    }

    public void setAuthorBirthDate(int authorBirthDate) {
        this.authorBirthDate = authorBirthDate;
    }

    public String getAuthorCountry() {
        return authorCountry;
    }

    public void setAuthorCountry(String authorCountry) {
        this.authorCountry = authorCountry;
    }
}
