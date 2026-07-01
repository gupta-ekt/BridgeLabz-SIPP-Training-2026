abstract class LibraryMember {

    protected String memberName;
    protected String memberId;

    public LibraryMember(String memberName,
                         String memberId) {

        this.memberName = memberName;
        this.memberId = memberId;
    }

    public abstract double calculateFine(int overdueDays);

    public void printDetails() {

        System.out.println("Member Name : " + memberName);
        System.out.println("Member ID : " + memberId);
    }
}

class StudentMember extends LibraryMember {

    public StudentMember(String name,
                         String id) {

        super(name, id);
    }

    @Override
    public double calculateFine(int overdueDays) {

        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {

    public FacultyMember(String name,
                         String id) {

        super(name, id);
    }

    @Override
    public double calculateFine(int overdueDays) {

        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {

    public GuestMember(String name,
                       String id) {

        super(name, id);
    }

    @Override
    public double calculateFine(int overdueDays) {

        return overdueDays * 5;
    }
}

public class SmartLibraryMembershipSystem {

    public static void main(String[] args) {

        LibraryMember[] members = {

                new StudentMember("Rahul", "S101"),
                new FacultyMember("Dr. Sharma", "F201"),
                new GuestMember("Aman", "G301")
        };

        int overdueDays = 4;

        for (LibraryMember member : members) {

            member.printDetails();

            System.out.println("Fine = ₹" +
                    member.calculateFine(overdueDays));

            System.out.println();
        }

        String searchId = "F201";

        System.out.println("Searching for Member ID: " + searchId);

        for (LibraryMember member : members) {

            if (member.memberId.equals(searchId)) {

                System.out.println("Member Found!");

                member.printDetails();
            }
        }
    }
}