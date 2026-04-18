import com.example.demo8.SinhVien;
import com.example.demo8.SinhVienService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Bai2Test {
    SinhVienService svService = new SinhVienService();
    @Test
    void updateThanhCong(){
        SinhVien sinhVien = new SinhVien("SV1","Nam",18,7.8f,5,"PTPM");
        svService.updateSV(sinhVien,"Long",8.8f,19,6,"Nail");
        assertEquals("Long",sinhVien.getTen());
        assertEquals(8.8f,sinhVien.getDiemTB());
        assertEquals(19,sinhVien.getTuoi());
    }

    @Test
    void updatetenRong(){
        SinhVien sinhVien = new SinhVien("SV1","Nam",18,7.8f,5,"PTPM");
        assertThrows(IllegalArgumentException.class,()->{
            svService.updateSV(sinhVien,null,8.8f,19,6,"Nail");
        } ) ;
    }
    @Test
    void updatetuoiAm(){
        SinhVien sinhVien = new SinhVien("SV1","Nam",18,7.8f,5,"PTPM");
        assertThrows(IllegalArgumentException.class,()->{
           svService.updateSV(sinhVien,"Nam",8.8f,-10,6,"Nail");
        });
    }
}
