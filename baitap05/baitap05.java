package baitap05;

import com.sun.tools.javac.Main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baitap05 {
    private List<Event> events = new ArrayList<Event>();
    public void addEvent(String name, LocalDateTime startDate, LocalDateTime endDate) {
        Event e = new Event(name, startDate, endDate);
        events.add(e);
    }
    public void displayEvents() {
        System.out.println("Danh sách sự kiện:");
        for (Event e : events) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        baitap05 obj = new baitap05();
        while(true) {
            String name = Validator.getString(scanner, "Nhập tên sự kiện (hoặc 'exit' để thoát): ");
            if (name.equalsIgnoreCase("exit")){
                break;
            }
            LocalDateTime starDate = Validator.getDateTime(scanner, "Nhập thời gian bắt đầu (dd-MM-yyyy HH:mm): ");
            LocalDateTime endDate = Validator.getDateTime(scanner, "Nhập thời gian kết thúc (dd-MM-yyyy HH:mm): ");
            obj.addEvent(name, starDate, endDate);

        }
        obj.displayEvents();

    }
}
