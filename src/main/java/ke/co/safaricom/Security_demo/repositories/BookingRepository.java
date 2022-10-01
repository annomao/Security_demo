package ke.co.safaricom.Security_demo.repositories;

import ke.co.safaricom.Security_demo.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
