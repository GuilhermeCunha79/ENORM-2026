package pt.isep.enorm.ref.amazonscenario.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import pt.isep.enorm.ref.amazonscenario.domain.AmazonscenarioUser;
import pt.isep.enorm.ref.amazonscenario.domain.Product;

@MappedSuperclass
public abstract class GeneratedProductreview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id", nullable = false)
    private AmazonscenarioUser author;

@ManyToOne(fetch = FetchType.LAZY, optional = false)
@JoinColumn(name = "subject_id", nullable = false)
private Product subject;

    @Column(nullable = false, length = 2000)
    private String comment;

@Min(1)
@Max(5)
@Column(nullable = false)
private int grade;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public AmazonscenarioUser getAuthor() { return author; }
    public void setAuthor(AmazonscenarioUser author) { this.author = author; }
public Product getSubject() { return subject; }
public void setSubject(Product subject) { this.subject = subject; }
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
public int getGrade() { return grade; }
public void setGrade(int grade) { this.grade = grade; }
}
