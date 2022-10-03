package ke.co.safaricom.Security_demo.controllers;

import ke.co.safaricom.Security_demo.dtos.BookingCreateRequest;
import ke.co.safaricom.Security_demo.entities.Booking;
import ke.co.safaricom.Security_demo.services.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
public class BookingController {

   private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("bookings/get/{id}")
    public ResponseEntity<Booking> getOneBooking(@PathVariable long id){
        return ResponseEntity.of(bookingService.getBookings(id));
    }
    @DeleteMapping("bookings/delete/{id}")
    public ResponseEntity<String> deleteBooking(@PathVariable long id){
        return ResponseEntity.ok(bookingService.deleteBooking(id));
    }
    @PostMapping("/bookings")
    public ResponseEntity<Booking> createBooking(@RequestBody BookingCreateRequest booking){
        return ResponseEntity.ok(bookingService.createBooking(booking));
    }


}
