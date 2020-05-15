package cn.zenghome.bbs.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.context.ContextLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

@Data
@Entity
@NoArgsConstructor
public class User implements UserDetails {

    @Id
    @GeneratedValue
    private long id;

    private String username;

    private String password;

    private Date createAt;

    private boolean enabled;

    private boolean credentialsNonExpired;

    private boolean accountNonExpired;

    private boolean accountNonLocked;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        ApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
        if (context != null) {
            AuthorityRepository repository = context.getBean(AuthorityRepository.class);

            return repository.findAuthoritiesByAuthorityKey_UserId(id);
        }
        return Collections.emptyList();
    }

    public User(UserDetails userDetails) {
        update(userDetails);
        createAt = Date.valueOf(LocalDate.now());
    }

    public void update(UserDetails userDetails) {
        username = userDetails.getUsername();
        password = userDetails.getPassword();
        enabled = userDetails.isEnabled();
        credentialsNonExpired = userDetails.isCredentialsNonExpired();
        accountNonExpired = userDetails.isAccountNonExpired();
        accountNonLocked = userDetails.isAccountNonLocked();
    }
}
