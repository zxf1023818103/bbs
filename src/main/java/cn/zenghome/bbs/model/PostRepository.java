package cn.zenghome.bbs.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PostRepository extends JpaRepository<Post, Long> {

    Page<Post> findPostsByRootIdIsNullAndForumIdOrderByPriorityDescCreateAtDesc(Pageable pageable, Long forumId);

}
