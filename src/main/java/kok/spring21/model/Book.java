package kok.spring21.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book{

    private String name;
    private String author;

}
