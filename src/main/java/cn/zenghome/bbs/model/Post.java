package cn.zenghome.bbs.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
public class Post {

    @Id
    @GeneratedValue
    private long id;

    private long parentId;

    private long userId;

    private Date createAt;

    private String title;

    private String content;
}
