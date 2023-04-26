package JAVA24;
/* В нашем САедующем проекте F o n tMapp e r хеш-карта применяется для
управления коААекцией Шрифтов. Класс Font из пакета j ava . awt предназначен
для создания шрифтов и отображения текста в графическом интерфейсе
пользователя. Описание шрифта включает ero имя, размер (в пунктах) и начертание
(обычный, полужирный или курсив).*/

import java.awt.*;
import java.util.*;

public class FontMapper {
    public FontMapper(){
        Font times = new Font("Times New Roman", Font.BOLD, 12);
        Font verdana = new Font("Verdana", Font.ITALIC, 25);
        Font courier = new Font("Courier New", Font.PLAIN, 6);
        HashMap<String, Font> fonts = new HashMap<>();
        fonts.put("Main text", times);
        fonts.put("Title", verdana);
        fonts.put("Small font", courier);
        for(Map.Entry<String, Font> entry : fonts.entrySet()){
            String key = entry.getKey();
            Font value = entry.getValue();
            System.out.println(key + ": " + value.getSize() + "-pt " + value.getFontName());
        }
    }
    public static void main(String[] args) {
        new FontMapper();
    }
}
