package ke.co.safaricom.Security_demo.repositories;

import ke.co.safaricom.Security_demo.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepositories extends JpaRepository<Booking, Long> {
}
