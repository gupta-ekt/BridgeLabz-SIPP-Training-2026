package oopsPractice.gcrCodebase.interfaces;

interface CouponValidator {

    // Abstract Method
    void validateCoupon(String code);

    // Static Method
    static boolean isLengthValid(String code) {
        return code.length() >= 6;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public void validateCoupon(String code) {

        if (CouponValidator.isLengthValid(code)) {
            System.out.println(code + " -> Valid Coupon");
        } else {
            System.out.println(code + " -> Invalid Coupon");
        }

    }
}

public class Coupons {

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "OFF20",
                "ABC",
                "WELCOME",
                "12345"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String code : coupons) {
            cart.validateCoupon(code);
        }

    }
}