package cn.zenghome.bbs.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Calendar;

@Data
@Entity
public class Post {

    @Id
    @GeneratedValue
    private long id;

    private long parentId;

    private long forumId;

    private long rootId;

    private long userId;

    private long priority;

    @CreationTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Calendar createAt;

    @UpdateTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Calendar updateAt;

    private String title;

    private String content;
}
