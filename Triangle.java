public class Triangle {
    public static String findTriangle(int side1, int side2, int side3) {
        String triangle = "NA";

        // checking whether it follows an Inquality theorem or not
        if((side1+side2 > side3) && (side1+side3 > side2) && (side2+side3 > side1)) {
            // checking for equilateral
            if(side1 == side2 && side2 == side3) {
                triangle = "Equilateral";
            } else if(side1 == side2 || side2 == side3 || side3 == side1) { // chekcing for Isosceles
                triangle = "Isosceles";
            } else { // for Scalen triangle
                triangle = "Scalene";
            }
        }

        // returning triangle type
        return triangle;
    }
}
