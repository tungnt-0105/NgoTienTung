package b4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaiHat {
    private String id;
    private String ten;
    private String tenCaSi;
    private int doDai;
    private String tenNhacSi;
}
