package cn.zenghome.bbs.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteKey> {
}
