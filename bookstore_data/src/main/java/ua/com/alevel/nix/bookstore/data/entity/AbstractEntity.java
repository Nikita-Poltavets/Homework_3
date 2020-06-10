package ua.com.alevel.nix.bookstore.data.entity;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", nullable = false, updatable = false)
    private Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_TIME", nullable = false)
    private Date updateTime;

    @PreUpdate
    public void onPreUpdate() {
        this.updateTime = new Date();
    }

    public AbstractEntity() {
        this.createTime = new Date();
        this.updateTime = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
