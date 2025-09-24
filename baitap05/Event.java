package baitap05;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Event {
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;


    public Event(String name, LocalDateTime startDate, LocalDateTime endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return
                "name: " + name  +
                ", startDate: " + startDate.format(formatter) +
                ", endDate: " + endDate.format(formatter) ;
    }
}
