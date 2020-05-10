
import com.kdh.practice.Entity.HashEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class test {

    List<String> list;
    List<HashEntity> hashList;


    @BeforeEach
    public void setUp() {
        list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        HashEntity h1 = new HashEntity("1", "value1");
        HashEntity h2 = new HashEntity("2", "value2");
        HashEntity h3 = new HashEntity("3", "value3");

        hashList.add(h1);
        hashList.add(h2);
        hashList.add(h3);
    }



    @Test
    @DisplayName("filtering")
    public void ListFiltering() {
        List<String> filteredList = list.stream().filter( (String v) -> v.equals("b")).collect(Collectors.toList());
        assertThat(filteredList.size()).isEqualTo(1);
    }

    @Test
    @DisplayName("extracting")
    public void MapExtracting() {
//        String [] EntityArr = hashList.stream().collec

    }
}
