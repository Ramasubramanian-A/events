import java.util.ArrayList;
import java.util.List;

class ThrillPark {
    // Park Information
    private String name = "Thrill Park";
    private List<String> rides;
    private String instagramHandle = "thrill_park_";
    private String contactNumber = "7200655775";

    // Constructor to initialize rides
    public ThrillPark() {
        rides = new ArrayList<>();
        rides.add("Zipline");
        rides.add("Zipcycle");
        rides.add("ATV");
        rides.add("Cricket");
        rides.add("VR");
        rides.add("Wall Climbing");
        rides.add("Rocket Ejector");
        rides.add("Rope Course");
    }

    // Method to display park details
    public void displayParkDetails() {
        System.out.println("Welcome to " + name + "!");
        System.out.println("Enjoy our thrilling rides:");
        for (String ride : rides) {
            System.out.println("- " + ride);
        }
        System.out.println("\nFollow us on Instagram: @" + instagramHandle);
        System.out.println("Contact us: " + contactNumber + " (Call/WhatsApp)");
    }
}

class Event {
    private String eventName;
    private String day;
    private double price;

    public Event(String eventName, String day, double price) {
        this.eventName = eventName;
        this.day = day;
        this.price = price;
    }

    public void displayEventDetails() {
        System.out.println("\nUpcoming Event: " + eventName);
        System.out.println("Day: " + day);
        System.out.println("Price: ₹" + price);
    }
}

class Booking {
    public void bookEvent(String eventName, String contactNumber) {
        System.out.println("\nBooking confirmed for the event: " + eventName);
        System.out.println("For any queries, contact: " + contactNumber);
    }
}

public class ThrillParkApp {
    public static void main(String[] args) {
        // Initialize Thrill Park
        ThrillPark park = new ThrillPark();
        park.displayParkDetails();

        // Event Details
        Event djParty = new Event("Saturday DJ Party", "Saturday", 499);
        djParty.displayEventDetails();

        // Booking an event
        Booking booking = new Booking();
        booking.bookEvent("Saturday DJ Party", "7200655775");

        // Special Celebrations
        System.out.println("\nCelebrate your special moments at Thrill Park!");
        System.out.println("Pre-book for birthdays, anniversaries, or any occasion: 7200655775");
    }
}
