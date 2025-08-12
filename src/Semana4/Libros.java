//Efrain Retana Segura UNA
package Semana4;

import lombok.AllargaConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Libro {
    private int id;
    private String titulo;
    private int año;
    private String genero;
    private String isbn;
}
