package cn.zenghome.bbs.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface AuthorityRepository extends JpaRepository<Authority, AuthorityKey> {

    List<Authority> findAuthoritiesByAuthorityKey_UserId(Long userId);
}
