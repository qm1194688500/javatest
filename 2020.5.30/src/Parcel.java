import javax.print.attribute.standard.Destination;

public class Parcel {
    public Destination destination(String s) {
        class PDestination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }
    public static void main(String[] args) {
        Parcel p = new Parcel();
        Destination d = p.destination("Tasmania");
    }
}
