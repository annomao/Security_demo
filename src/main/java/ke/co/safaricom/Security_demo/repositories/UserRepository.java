package ke.co.safaricom.Security_demo.repositories;

import ke.co.safaricom.Security_demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
