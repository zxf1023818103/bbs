package cn.zenghome.bbs.model;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService, UserDetailsManager {

    private UserRepository userRepository;

    private UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public void createUser(UserDetails userDetails) {
        userRepository.saveAndFlush(new User(userDetails));
    }

    @Override
    public void updateUser(UserDetails userDetails) {
        User user = userRepository.findUserByUsername(userDetails.getUsername());
        if (user != null) {
            user.update(userDetails);
            userRepository.saveAndFlush(user);
        }
    }

    @Override
    public void deleteUser(String username) {
        userRepository.deleteUserByUsername(username);
    }

    @Override
    public void changePassword(String username, String password) {
        User user = userRepository.findUserByUsername(username);
        if (user != null) {
            user.setPassword(password);
            userRepository.saveAndFlush(user);
        }
    }

    @Override
    public boolean userExists(String username) {
        return userRepository.existsUserByUsername(username);
    }
}
