package com.homework.nix.bookstore.data.entity;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class AbstractUpdateEntity extends AbstractEntity{

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_TIME", nullable = false)
    private Date updateTime;

    @PreUpdate
    public void onPreUpdate() {
        this.updateTime = new Date();
    }

    public AbstractUpdateEntity(){
        super();
        this.updateTime = new Date();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

}
