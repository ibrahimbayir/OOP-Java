package LastOne;

public class Customer {
        private int ID;
        private String name;
        private char gender;

        public Customer(int ID, String name, char gender) {
            this.ID = ID;
            this.name = name;
            this.gender = gender;
        }

        public int getID() {
            return ID;
        }

        public String getName() {
            return name;
        }

        public char getGender() {
            if (gender == 'm' || gender == 'M'){
                System.out.println("M");
            }
            else if (gender == 'f' || gender == 'F') {
                System.out.println("F");
            }
            return gender;
        }

        @Override
        public String toString() {
            return "Customer[ID=" + ID + ", Name=" + name + ", Gender=" + gender + "]";
        }
    }

