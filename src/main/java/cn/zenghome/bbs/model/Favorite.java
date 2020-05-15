package cn.zenghome.bbs.model;

import lombok.Getter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
@Getter
public class Favorite {

    @EmbeddedId
    private FavoriteKey favoriteKey;
}
