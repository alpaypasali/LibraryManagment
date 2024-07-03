import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Publishers")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id" , columnDefinition = "serial")
    private  int publisherId;

    @Column(name = "publisher_name" , nullable = false)
    private String publisherName;

    @Column(name = "publisher_establishmentYear" , nullable = false)
    private int publisherEstablishmentYear;

    @Column(name = "publisher_address" , nullable = false)
    private String publisherAddress;

    @OneToMany(mappedBy = "publisher" , cascade = CascadeType.ALL)
    private List<Book> books;

    public Publisher() {
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getPublisherEstablishmentYear() {
        return publisherEstablishmentYear;
    }

    public void setPublisherEstablishmentYear(int publisherEstablishmentYear) {
        this.publisherEstablishmentYear = publisherEstablishmentYear;
    }

    public String getPublisherAddress() {
        return publisherAddress;
    }

    public void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress;
    }
}
