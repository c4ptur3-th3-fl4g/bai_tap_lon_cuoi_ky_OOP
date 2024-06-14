package qlsv.dao;

import qlsv.model.TaiKhoan;

/**
 *
 * @author trand
 */
public interface TaiKhoanDAO {
    
    public TaiKhoan login(String tdn, String mk);
}
