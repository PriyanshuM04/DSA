package OOPSinJAVA;

class Student {
        String name;
        int roll;
        double percentage;
        private int id;
        final String schoolName = "DAV";
        private static int numberOfStudents;

        public Student(){       // Default constructor
                numberOfStudents++;
        }

        public Student(String name, int roll, double per){
                this.name = name;
                this.roll = roll;
                percentage = per;
                numberOfStudents++;
        }

        // Getter
        public int getId(){
                return id;
        }

        // Setter
        public void setId(int id_no){
                id = id_no;
        }

        public static int getNumberOfStudents(){
                return numberOfStudents;
        }

        public void printInfo(String name){
                System.out.println(name);
        }
        public void printInfo(int roll){
                System.out.println(roll);
        }
        public void printInfo(String name, int roll){
                System.out.println(name + " " + roll);
        }
}
