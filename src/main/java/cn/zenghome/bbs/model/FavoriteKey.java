package cn.zenghome.bbs.model;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class FavoriteKey implements Serializable {

    private Long userId;

    private Long postId;
}
