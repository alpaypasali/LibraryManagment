import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id" , columnDefinition = "serial")
    private  int categoryId;

    @Column(name = "category_name" , nullable = false)
    private String categoryName;

    @Column(name = "category_description")
    private  String categoryDescription;

    @ManyToMany(mappedBy = "categories")
    private List<Book> books;

    public Category() {
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
}
