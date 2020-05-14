package cn.zenghome.bbs.model;

import lombok.Getter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@Getter
public class Follow {

    @EmbeddedId
    private FollowKey followKey;
}
