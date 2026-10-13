
class MovieTicket {
    String customerName, movieName;
    double ticketPrice;
    int numberOfTickets;

    MovieTicket(String customerName, String movieName) {
        this.customerName = customerName;
        this.movieName = movieName;
    }

    MovieTicket(String customerName, String movieName,
                double ticketPrice, int numberOfTickets) {
        this(customerName, movieName);
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    void bookTickets(int tickets) {
        numberOfTickets = tickets;
    }

    void bookTickets(int tickets, double price) {
        numberOfTickets = tickets;
        ticketPrice = price;
    }

    void displayBooking() {
        System.out.println("\nCustomer Name : " + customerName.toUpperCase());
        System.out.println("Movie Name    : " + movieName.toUpperCase());

        if (numberOfTickets <= 0) {
            System.out.println("Invalid number of tickets");
            return;
        }

        double total = ticketPrice * numberOfTickets;
        double discount = 0;

        if (numberOfTickets >= 5) {
            discount = total * 0.10;
        }

        System.out.println("Ticket Price  : Rs. " + ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Booking Status: Booking Successful");
        System.out.println("Total Amount  : Rs. " + total);
        System.out.println("Discount      : Rs. " + discount);
        System.out.println("Final Amount  : Rs. " + (total - discount));
    }

    public static void main(String[] args) {
        System.out.println("========== CINEMA TICKET BOOKING ==========");

        MovieTicket m1 = new MovieTicket("Sneha", "Avatar", 200, 5);
        m1.displayBooking();

        MovieTicket m2 = new MovieTicket("Arjun", "Avatar");
        m2.bookTickets(2, 200);
        m2.displayBooking();

        if (m1.customerName.equalsIgnoreCase(m2.customerName)) {
            System.out.println("Same customer");
        } else {
            System.out.println("Different customers");
        }
    }
}
