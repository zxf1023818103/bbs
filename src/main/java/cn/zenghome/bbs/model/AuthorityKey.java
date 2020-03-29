package cn.zenghome.bbs.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class AuthorityKey implements Serializable, GrantedAuthority {

    private long userId;

    private String authority;
}
