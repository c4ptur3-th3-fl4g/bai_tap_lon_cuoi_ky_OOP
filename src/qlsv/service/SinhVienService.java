package qlsv.service;

import java.util.List;
import qlsv.model.SinhVien;

/**
 *
 * @author trand
 */
public interface SinhVienService {
    
    // Trả về danh sách sinh viên
    public List<SinhVien> getList();
    //Tạo mới, cập nhật thêm sinh viên
    public int createOrUpdate(SinhVien sinhVien);
    
}
