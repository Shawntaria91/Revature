package spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/*Lombok will automatically generate getter/setter methods and constructors
using reflection and annotations at runtime
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
//@Entity
//@Table
public class Pokemon {
    //    @Id
//    @NonNull
    private int pokeId;
    //    @Column
    private String name;
}
