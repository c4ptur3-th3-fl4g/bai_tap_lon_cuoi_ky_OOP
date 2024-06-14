package qlsv.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import qlsv.model.SinhVien;



/**
 *
 * @author trand
 */
public class SinhVienDAOImpl implements SinhVienDAO {

    @Override
    public List<SinhVien> getList() {
        Connection cons = DBConnect.getConnection();
        String sql = "SELECT * FROM sinh_vien";
        List<SinhVien> list = new ArrayList<>();
        try {
            PreparedStatement ps = cons.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVien sinhVien = new SinhVien();
                sinhVien.setMa_sinh_vien(rs.getInt("ma_sinh_vien"));
                sinhVien.setHo_ten(rs.getString("ho_ten"));
                sinhVien.setSo_dien_thoai(rs.getString("so_dien_thoai"));
                sinhVien.setDia_chi(rs.getString("dia_chi"));
                sinhVien.setNgay_sinh(rs.getDate("ngay_sinh"));
                sinhVien.setGioi_tinh(rs.getBoolean("gioi_tinh"));
                sinhVien.setTinh_trang(rs.getBoolean("tinh_trang"));
                list.add(sinhVien);
            }
            ps.close();
            cons.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int createOrUpdate(SinhVien sinhVien) {
        try {
            Connection cons = DBConnect.getConnection();
            String sql = "INSERT INTO sinh_vien(ma_sinh_vien, ho_ten, ngay_sinh, gioi_tinh, so_dien_thoai, dia_chi, tinh_trang) VALUES(?, ?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE ho_ten = VALUES(ho_ten), ngay_sinh = VALUES(ngay_sinh), gioi_tinh = VALUES(gioi_tinh), so_dien_thoai = VALUES(so_dien_thoai), dia_chi = VALUES(dia_chi), tinh_trang = VALUES(tinh_trang);";
            PreparedStatement ps = cons.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, sinhVien.getMa_sinh_vien());
            ps.setString(2, sinhVien.getHo_ten());
            ps.setDate(3, new Date(sinhVien.getNgay_sinh().getTime()));
            ps.setBoolean(4, sinhVien.isGioi_tinh());
            ps.setString(5, sinhVien.getSo_dien_thoai());
            ps.setString(6, sinhVien.getDia_chi());
            ps.setBoolean(7, sinhVien.isTinh_trang());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            ps.close();
            cons.close();
            return generatedKey;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }



    public static void main(String[] args) {
        SinhVienDAO sinhVienDAO = new SinhVienDAOImpl();
        System.out.println(sinhVienDAO.getList());
    }

}
