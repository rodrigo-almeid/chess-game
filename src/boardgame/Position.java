package boardgame;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
    public class Position {
        private int row;
    private int column;

@Override
    public String toString() {
     return  row + ", " + column;
    }
}
