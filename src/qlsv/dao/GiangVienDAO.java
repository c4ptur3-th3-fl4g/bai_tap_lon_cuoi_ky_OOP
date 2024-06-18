package qlsv.dao;

import java.util.List;
import qlsv.model.GiangVien;

/**
 *
 * @author trand
 */
public interface GiangVienDAO {
    
    public List<GiangVien> getList(); // return list of GiangVien
    public int createOrUpdate(GiangVien giangVien); // return 1 if success, 0 if fail
}
