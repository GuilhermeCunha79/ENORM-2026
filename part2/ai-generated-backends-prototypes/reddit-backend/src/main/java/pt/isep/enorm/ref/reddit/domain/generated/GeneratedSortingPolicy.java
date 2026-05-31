package pt.isep.enorm.ref.reddit.domain.generated;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import pt.isep.enorm.ref.reddit.domain.Subreddit;
import pt.isep.enorm.ref.reddit.domain.enums.SortCriterion;
import pt.isep.enorm.ref.reddit.domain.enums.SortDirection;

@MappedSuperclass
public abstract class GeneratedSortingPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 16)
    private SortCriterion criterion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 8)
    private SortDirection direction;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "subreddit_id", nullable = false)
    private Subreddit subreddit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SortCriterion getCriterion() {
        return criterion;
    }

    public void setCriterion(SortCriterion criterion) {
        this.criterion = criterion;
    }

    public SortDirection getDirection() {
        return direction;
    }

    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }

    public Subreddit getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(Subreddit subreddit) {
        this.subreddit = subreddit;
    }
}



