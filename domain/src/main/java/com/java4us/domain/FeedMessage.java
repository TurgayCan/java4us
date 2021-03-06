package com.java4us.domain;
// Generated Jan 14, 2014 10:36:40 PM by Hibernate Tools 3.6.0

import com.java4us.domain.common.enums.BaseStatus;
import com.java4us.domain.common.enums.Category;
import com.java4us.domain.core.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author turgaycan
 *
 */
@Entity
@Table(name = "feedmessage", schema = "java4us")
@SequenceGenerator(name = "feedmessage_id_seq", sequenceName = "feedmessage_id_seq", allocationSize = 1)
public class FeedMessage extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 3619193884463419855L;

    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "feedmessage_id_seq")
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "link", nullable = false, unique = true)
    private String link;
    @Column(name = "author", nullable = true)
    private String author;
    @Column(name = "guid", nullable = true)
    private String guid;
    @Column(name = "pubdate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date pubdate;
    @ManyToOne(fetch = FetchType.LAZY)
    private Feed feed;
    @Column(name = "createdate", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date createDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private Category category;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private BaseStatus status;
    @Column
    private boolean proceed = true;
    @Column
    private int viewCount;
    @Column
    private int goToLinkCount;

    public FeedMessage() {
    }

    public FeedMessage(Long id, String title, String description, String link, String guid) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.link = link;
        this.guid = guid;
    }

    public FeedMessage(Long id, String title, String description, String link, String author, String guid, Date pubdate, Category category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.link = link;
        this.author = author;
        this.guid = guid;
        this.pubdate = pubdate;
        this.category = category;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BaseStatus getStatus() {
        return status;
    }

    public void setStatus(BaseStatus status) {
        this.status = status;
    }

    public boolean isProceed() {
        return proceed;
    }

    public void setProceed(boolean proceed) {
        this.proceed = proceed;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getGoToLinkCount() {
        return goToLinkCount;
    }

    public void setGoToLinkCount(int goToLinkCount) {
        this.goToLinkCount = goToLinkCount;
    }
}
