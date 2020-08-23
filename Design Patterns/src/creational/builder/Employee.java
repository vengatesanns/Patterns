package creational.builder;

/**
 * @author Vengatesan Nagarajan
 */
public class Employee {

    public static class Education {
        private float sslc;
        private float hsc;
        private float diploma;
        private float ug;
        private float pg;

        public Education() {

        }

        public Education sslc(float sslcPercentage) {
            this.sslc = sslcPercentage;
            return this;
        }

        public Education hsc(float hscPercentage) {
            this.hsc = hscPercentage;
            return this;
        }

        public Education diploma(float diplomaPercentage) {
            this.diploma = diploma;
            return this;
        }

        public Education ug(float ugPercentage) {
            this.ug = ugPercentage;
            return this;
        }

        public Education pg(float pgPercentage) {
            this.pg = pgPercentage;
            return this;
        }

        public Employee percentage() {
            return new Employee(this);
        }


    }

    private final float sslc;
    private final float hsc;
    private final float diploma;
    private final float ug;
    private final float pg;

    Employee(Education education) {
        this.sslc = education.sslc;
        this.hsc = education.hsc;
        this.diploma = education.diploma;
        this.ug = education.ug;
        this.pg = education.pg;

    }

    public float getSslc() {
        return sslc;
    }

    public float getHsc() {
        return hsc;
    }

    public float getDiploma() {
        return diploma;
    }

    public float getUg() {
        return ug;
    }

    public float getPg() {
        return pg;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "sslc=" + sslc +
                ", hsc=" + hsc +
                ", diploma=" + diploma +
                ", ug=" + ug +
                ", pg=" + pg +
                '}';
    }
}
