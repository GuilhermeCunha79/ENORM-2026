package pt.isep.enorm.ref.reddit.domain.generated;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import pt.isep.enorm.ref.reddit.domain.Subreddit;
import pt.isep.enorm.ref.reddit.domain.RedditUser;

@MappedSuperclass
public abstract class GeneratedSubscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "subscriber_id", nullable = false)
    private RedditUser subscriber;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "subreddit_id", nullable = false)
    private Subreddit subreddit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public RedditUser getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(RedditUser subscriber) {
        this.subscriber = subscriber;
    }

    public Subreddit getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(Subreddit subreddit) {
        this.subreddit = subreddit;
    }
}




