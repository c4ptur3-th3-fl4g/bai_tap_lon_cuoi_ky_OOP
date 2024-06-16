package qlsv.service;
import java.util.List;
import qlsv.model.GiangVien;

public interface GiangVienService {
    // Trả về danh sách giảng viên
    public List<GiangVien> getList();
    //Tạo mới, cập nhật thêm giảng viên
    public int createOrUpdate(GiangVien giangVien);

}
