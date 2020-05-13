package cn.zenghome.bbs.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Forum {

    @Id
    @GeneratedValue
    private long id;

    private String name;
}
