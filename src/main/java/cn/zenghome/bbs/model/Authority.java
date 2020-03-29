package cn.zenghome.bbs.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Authority extends AuthorityKey {

    @EmbeddedId
    private AuthorityKey authorityKey;
}
