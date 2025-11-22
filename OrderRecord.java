package _26187_.q10;

import java.util.Scanner;

public final class OrderRecord extends Invoice {

    public OrderRecord(long id, String createdDate, String updatedDate, String storeName, String addressStore, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String address, String orderDate, String orderId, String paymentMethod, String paymentStatus, String shippingAddress, double shippingCost) throws OnlineShoppingDataException {
        super(id, createdDate, updatedDate, storeName, addressStore, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, address, orderDate, orderId, paymentMethod, paymentStatus, shippingAddress, shippingCost);
    }

    public double calculateTotalAmount() { return getPrice() + getShippingCost(); }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("25873 Enter Entity (id createdDate updatedDate):");
            long id = Long.parseLong(sc.next());
            String createdDate = sc.next();
            String updatedDate = sc.next();

            System.out.println("25873 Enter Store (name address email):");
            String storeName = sc.next();
            String address = sc.next();
            String email = sc.next();

            System.out.println("25873 Enter Category (name code):");
            String categoryName = sc.next();
            String categoryCode = sc.next();

            System.out.println("25873 Enter Product (name code price):");
            String productName = sc.next();
            String productCode = sc.next();
            double price = Double.parseDouble(sc.next());

            System.out.println("25873 Enter Customer (name contact address):");
            String customerName = sc.next();
            String contactNumber = sc.next();
            String addressCust = sc.next();

            System.out.println("25873 Enter Order (orderDate orderId):");
            String orderDate = sc.next();
            String orderId = sc.next();

            System.out.println("25873 Enter Payment (method status):");
            String paymentMethod = sc.next();
            String paymentStatus = sc.next();

            System.out.println("25873 Enter Shipping (shippingAddress shippingCost):");
            String shippingAddress = sc.next();
            double shippingCost = Double.parseDouble(sc.next());

            OrderRecord rec = new OrderRecord(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, addressCust, orderDate, orderId, paymentMethod, paymentStatus, shippingAddress, shippingCost);

            System.out.println("25873 Product Price: " + String.format("%.2f", rec.getPrice()));
            System.out.println("25873 Shipping Cost: " + String.format("%.2f", rec.getShippingCost()));
            System.out.println("25873 Total Amount: " + String.format("%.2f", rec.calculateTotalAmount()));

        } catch (OnlineShoppingDataException osde) {
            System.out.println("25873 Error: " + osde.getMessage());
        } catch (Exception e) {
            System.out.println("25873 Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
