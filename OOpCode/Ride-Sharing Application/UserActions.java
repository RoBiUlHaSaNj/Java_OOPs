interface UserActions {
    void rate(int rating);
}

class DriverWithRating extends Driver implements UserActions {
    public DriverWithRating(String name, String email, Vehicle vehicle) {
        super(name, email, vehicle);
    }

    @Override
    public void rate(int rating) {
        System.out.println(getName() + " received a rating of " + rating + " stars.");
    }
}

class PassengerWithRating extends Passenger implements UserActions {
    public PassengerWithRating(String name, String email) {
        super(name, email);
    }

    @Override
    public void rate(int rating) {
        System.out.println(getName() + " gave a rating of " + rating + " stars.");
    }
}
