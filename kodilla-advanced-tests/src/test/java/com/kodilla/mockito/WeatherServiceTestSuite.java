package com.kodilla.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {
    WeatherService weatherService = new WeatherService();
    Client client = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);
    Location location = Mockito.mock(Location.class);

    @Test
    public void subscriberShouldReceiveNotificationFromLocationToWitchHeIsSubscribed() {
        Location location1 = Mockito.mock(Location.class);
        weatherService.addSubscriber(client, location);
        weatherService.addSubscriber(client, location1);
        weatherService.sentNotificationToLocation(notification, location);
        weatherService.sentNotificationToLocation(notification, location1);
        Mockito.verify(client, Mockito.times(2)).receive(notification);
    }

    @Test
    public void subscriberShouldBeAbleToRemoveSubscriptionToLocation() {
        Location location1 = Mockito.mock(Location.class);
        weatherService.addSubscriber(client, location);
        weatherService.addSubscriber(client, location1);
        weatherService.removeSubscriptionFromLocation(client, location1);
        weatherService.sentNotificationToLocation(notification, location);
        weatherService.sentNotificationToLocation(notification, location1);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldRemoveAllSubscriptions() {
        Location location1 = Mockito.mock(Location.class);
        weatherService.addSubscriber(client, location);
        weatherService.addSubscriber(client, location1);
        weatherService.removeAllSubscriptions(client);
        weatherService.sentNotificationToLocation(notification, location);
        weatherService.sentNotificationToLocation(notification, location1);
        Mockito.verify(client, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldSentNotificationOnlyToSubscribesSubscribedToLocation() {
        Client client1 = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Client client3 = Mockito.mock(Client.class);
        Location location1 = Mockito.mock(Location.class);
        weatherService.addSubscriber(client, location);
        weatherService.addSubscriber(client, location1);
        weatherService.removeSubscriptionFromLocation(client, location1);
        weatherService.addSubscriber(client1, location);
        weatherService.addSubscriber(client2, location);
        weatherService.addSubscriber(client3, location1);
        weatherService.sentNotificationToLocation(notification, location);
        weatherService.sentNotificationToLocation(notification, location1);

        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
        Mockito.verify(client2, Mockito.times(1)).receive(notification);
        Mockito.verify(client3, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldSentNotificationToAllSubscribers() {
        Client client1 = Mockito.mock(Client.class);
        Location location1 = Mockito.mock(Location.class);
        weatherService.addSubscriber(client, location);
        weatherService.addSubscriber(client1, location1);
        weatherService.sendNotificationToAll(notification);
        Mockito.verify(client, Mockito.times(1)).receive(notification);
        Mockito.verify(client1, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldRemoveLocationForAllSubscribers() {
        Client client1 = Mockito.mock(Client.class);
        Client client2 = Mockito.mock(Client.class);
        Client client3 = Mockito.mock(Client.class);
        weatherService.addSubscriber(client, location);
        weatherService.addSubscriber(client1, location);
        weatherService.addSubscriber(client2, location);
        weatherService.addSubscriber(client3, location);
        weatherService.removeLocation(location);
        Mockito.verify(client, Mockito.never()).receive(notification);
        Mockito.verify(client1, Mockito.never()).receive(notification);
        Mockito.verify(client2, Mockito.never()).receive(notification);
        Mockito.verify(client3, Mockito.never()).receive(notification);
    }

}