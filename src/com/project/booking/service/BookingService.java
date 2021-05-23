package com.project.booking.service;

import com.project.booking.entity.Bill;
import com.project.booking.entity.Client;
import com.project.booking.entity.Hotel;
import com.project.booking.entity.Room;

public class BookingService {

    private String clientName;

    public void book(Hotel hotel, Client client, int numberOfPerson) {
        Room[] rooms = hotel.getRooms();
        boolean isFreeRooms = false;
        for (Room r : rooms) {
            if (r.isFree()) {
                isFreeRooms = true;
            }
        }
        if (!isFreeRooms) {
            System.out.println("Cвободных номеров в отеле: " + hotel.getName() + " нет");
        }

        bookRoom(client, numberOfPerson, rooms);

    }

    private void bookRoom(Client client, int numberOfPerson, Room[] rooms) {
        for (Room room : rooms) {
            clientName = client.getName();
            if (room.getCountOfPerson() == numberOfPerson) {
                System.out.println("Нашелся номер для юзреа " + clientName);
                if (client.getBill().getAmount() >= room.getCost()) {
                    Bill clientBill = client.getBill();
                    clientBill.setAmount(clientBill.getAmount() - room.getCost());
                    room.setFree(false);
                    System.out.println("Номер был успешно забронирован клиентом "
                            + clientName);
                } else {
                    System.out.println("Не достаточно для бронироавание номера " + clientName);
                }
            }
        }
    }
}
