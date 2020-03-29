package cn.zenghome.bbs.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);

    void deleteUserByUsername(String username);

    boolean existsUserByUsername(String username);
}
