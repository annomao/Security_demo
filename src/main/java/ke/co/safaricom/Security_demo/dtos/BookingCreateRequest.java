package ke.co.safaricom.Security_demo.dtos;

public class BookingCreateRequest {
    private String service;
    private String booking_date;
    private String booking_time;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(String booking_date) {
        this.booking_date = booking_date;
    }

    public String getBooking_time() {
        return booking_time;
    }

    public void setBooking_time(String booking_time) {
        this.booking_time = booking_time;
    }
}
