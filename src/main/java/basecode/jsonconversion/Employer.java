package basecode.jsonconversion;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Employer {
    private String name;
    private String location;
    private String[] skills;
    private int empId;
}
