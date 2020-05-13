package cn.zenghome.bbs.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ForumRepository extends JpaRepository<Forum, Long> {
}
