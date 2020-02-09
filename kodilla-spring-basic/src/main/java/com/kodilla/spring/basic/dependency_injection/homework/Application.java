package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        NotificationService dhlNotificationService = new DhlDeliveryService();
        NotificationService dpdNotificationService = new DpdDeliveryService();

        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, dhlNotificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
        shippingCenter.sendPackage("Lake Street 22, Oregon", 41.8);

        ShippingCenter shippingCenter1 = new ShippingCenter(deliveryService, dpdNotificationService);
        shippingCenter1.sendPackage("Mountain Ave 2, Georgia", 2.45);
        shippingCenter1.sendPackage("Forest Hill 8, Texas", 27.0);
    }
}