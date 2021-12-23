package or.rahmani.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private Long code;
    private String name;
    private String family;
    private Long studentCode;
    private int entranceYear;
}
