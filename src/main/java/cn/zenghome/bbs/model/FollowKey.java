package cn.zenghome.bbs.model;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class FollowKey implements Serializable {

    private Long followerId;

    private Long followeeId;
}
