package qlsv.dao;
import java.util.List;
import qlsv.model.GiangVien;

public interface GiangVienDAO {
    public List<GiangVien> getList();
    public int createOrUpdate(GiangVien giangVien);    
}
