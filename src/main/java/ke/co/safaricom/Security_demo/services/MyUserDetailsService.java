package ke.co.safaricom.Security_demo.services;

import ke.co.safaricom.Security_demo.entities.MyUserDetails;
import ke.co.safaricom.Security_demo.entities.User;
import ke.co.safaricom.Security_demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("User does not exist");
        }
        return new MyUserDetails(user);
    }
}
