public class Rectangle {
    int width;
    int height;

    Rectangle() {
        width = 10;
        height = 10;
    }

    public static void main(String[] args) {
        Rectangle objRec = new Rectangle();

        System.out.println("Width: " + objRec.width);
        System.out.println("Height: " +  objRec.height);
    }
}
