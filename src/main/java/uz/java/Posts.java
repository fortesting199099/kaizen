package uz.java;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Posts {
    private int userId;
    private int id;
    private String title;
    private String body;
}
