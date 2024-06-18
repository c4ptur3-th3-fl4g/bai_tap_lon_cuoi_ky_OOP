package qlsv.service;

import java.util.List;
import qlsv.dao.GiangVienDAO;
import qlsv.dao.GiangVienDAOImpl;
import qlsv.model.GiangVien;

/**
 *
 * @author trand
 */
public class GiangVienServiceImpl implements GiangVienService {
    private GiangVienDAO giangVienDAO = null; // khai báo giảng viên DAO

    public GiangVienServiceImpl() { // khởi tạo giảng viên DAO
        giangVienDAO = new GiangVienDAOImpl();
    }

    @Override // lấy danh sách giảng viên
    public List<GiangVien> getList() {
        return giangVienDAO.getList();
    }

    @Override // thêm hoặc cập nhật giảng viên
    public int createOrUpdate(GiangVien giangVien) {
        return giangVienDAO.createOrUpdate(giangVien);
    }
}
