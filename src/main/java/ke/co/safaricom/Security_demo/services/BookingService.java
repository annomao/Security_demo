package ke.co.safaricom.Security_demo.services;

import ke.co.safaricom.Security_demo.dtos.BookingCreateRequest;
import ke.co.safaricom.Security_demo.entities.Booking;
import ke.co.safaricom.Security_demo.entities.User;
import ke.co.safaricom.Security_demo.repositories.BookingRepository;
import ke.co.safaricom.Security_demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    private final UserRepository userRepository;

    public BookingService(BookingRepository bookingRepository, UserRepository userRepository) {
        this.bookingRepository = bookingRepository;
        this.userRepository = userRepository;
    }

    public Booking createBooking(long id,BookingCreateRequest booking){
        User user = userRepository.getReferenceById(id);
        Booking booking1 = new Booking();
        booking1.setBooking_date(booking.getBooking_date());
        booking1.setBooking_time(booking.getBooking_time());
        booking1.setService(booking.getService());
        user.addBooking(booking1);
        userRepository.save(user);
        return booking1;
    }

    public Optional<Booking> getBookings(long id){
        return bookingRepository.findById(id);
    }

    public String deleteBooking(long id){
        Booking booking = bookingRepository.getReferenceById(id);
        if(booking==null){
            return "Booking id does not exist";
        }
        bookingRepository.deleteById(id);
        return "Booking Deleted successfully";
    }
}
