package cn.zenghome.bbs.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);

    void deleteUserByUsername(String username);

    boolean existsUserByUsername(String username);
}
