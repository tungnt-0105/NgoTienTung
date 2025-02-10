package b2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SinhVien {
    private int maSV;
    private String tenSV;
    private String lop;
    private String khoaHoc;
    private String monHoc;

}
