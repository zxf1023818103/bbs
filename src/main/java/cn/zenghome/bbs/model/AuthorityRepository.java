package cn.zenghome.bbs.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorityRepository extends JpaRepository<Authority, AuthorityKey> {

    List<Authority> findAllByUserId(Long userId);
}
