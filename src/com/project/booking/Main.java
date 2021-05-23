package com.project.booking;

import com.project.booking.entity.Bill;
import com.project.booking.entity.Client;
import com.project.booking.entity.Hotel;
import com.project.booking.entity.Room;
import com.project.booking.service.BookingService;

/**
 * В данном домашнем задании нужно написать систему бронировния номеров в отеле.
 * Сущности: Client, Hotel, Room, Bill.
 * <p>
 * Client будет содержать поля: имя, фамилию, номер телефона, почту, ссылку на Bill
 * В Bill будет сумма денег
 * Hotel будет содеражть поля: имя отеля, список номеров
 * Room будет содеражть колличество человек, которых можно разместить, стоимость этого номера и свободен ли этот номер
 * <p>
 * Сценарии:
 * Нужно создать нескольких клиентов с счетами и внести им первоначальную сумму. Так же нужно создать
 * несколько отелей, с разными наборами номеров (В списке внутри сущности Hotel)
 * Клиент должен попробовать забронировать номер, для этого он так же указывает
 * сколько человек в номере ему нужно разместить. После успешного бронирования списывать сумму со счета клиента.
 * <p>
 * Так же при бронировании проверять есть ли свободные номера
 * <p>
 * В одном из сценариев, клиенту должно не хватить денег для бронирования номера
 * <p>
 * В методе main не нужно проводить никаких операций, кроме создания начальных объектов, сервисов и вызова их методов
 */
public class Main {
    public static void main(String[] args) {
        Bill bill1 = new Bill(10000);
        Client client1 = new Client("Marat", "Maratov",
                "marat99@test.com", "+7894569", bill1);

        Bill bill2 = new Bill(15000);
        Client client2 = new Client("Samat", "Sunkarov",
                "sunkarov87@test.com", "+7889594", bill2);

        Room[] burabayHotelRooms = new Room[]{new Room(1, 1500, true),
                new Room(3, 3500, true),
                new Room(2, 2500, true)};

        Room[] zerendaHotelRooms = new Room[]{new Room(1, 1800, true),
                new Room(3, 3400, true),
                new Room(2, 2500, true)};

        Hotel burabeyHotel = new Hotel("Burabay", burabayHotelRooms);
        Hotel zerendaHotel = new Hotel("Zerenda", zerendaHotelRooms);


        BookingService bookingService = new BookingService();
        bookingService.book(burabeyHotel,client1,2);
        System.out.println("\n");
        bookingService.book(burabeyHotel,client1,4);
        bookingService.book(zerendaHotel,client2,3);
        System.out.println("\n");
        bookingService.book(zerendaHotel,client1,1);



    }
}
