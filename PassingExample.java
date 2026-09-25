public class PassingExample {

    static class SupplyBox {
        int pencils;

        SupplyBox(int pencils) {
            this.pencils = pencils;
        }
    }

    // Changes only the method's copy of the number.
    static void changeNumber(int number) {
        number = 20;
    }

    // Changes the object shared by both references.
    static void changeContents(SupplyBox box) {
        box.pencils = 20;
    }

    // Reassigns only the method's local reference.
    static void replaceBox(SupplyBox box) {
        box = new SupplyBox(50);
    }

    public static void main(String[] args) {
        int pencilCount = 10;
        SupplyBox classroomBox = new SupplyBox(10);

        changeNumber(pencilCount);
        System.out.println("Primitive: " + pencilCount);

        changeContents(classroomBox);
        System.out.println("After changing contents: "
                + classroomBox.pencils);

        replaceBox(classroomBox);
        System.out.println("After trying to replace box: "
                + classroomBox.pencils);
    }
}
