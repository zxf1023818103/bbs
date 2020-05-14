package cn.zenghome.bbs.model;

import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Getter
public class Authority implements Serializable, GrantedAuthority {

    @EmbeddedId
    private AuthorityKey authorityKey;


    @Override
    public String getAuthority() {
        return authorityKey.getAuthority();
    }
}
