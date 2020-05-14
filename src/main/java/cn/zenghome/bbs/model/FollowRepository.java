package cn.zenghome.bbs.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RepositoryRestController
public interface FollowRepository extends JpaRepository<Follow, FollowKey> {

    @GetMapping("/follower_numbers")
    int countByFollowKey_FolloweeId(@RequestParam("id") Long followeeId);

    @GetMapping("/followee_numbers")
    int countByFollowKey_FollowerId(@RequestParam("id") Long followerId);
}
