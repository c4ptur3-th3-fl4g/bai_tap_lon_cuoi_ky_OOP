package qlsv.controller;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author trand
 */
public class GiangVienController {
    private JButton btnSubmit;
    private JTextField jtfMaGiangVien;
    private JTextField jtfHoTen;
    private JDateChooser jdcNgaySinh;
    private JRadioButton jrdNam;
    private JRadioButton jrdNu;
    private JTextField jtfSoDienThoai;
    private JTextArea  jtaDiaChi;
    private JCheckBox jcbTinhTrang;
    private JLabel jlbMsg;

    public GiangVienController(JButton btnSubmit, JTextField jtfMaGiangVien, JTextField jtfHoTen,
            JDateChooser jdcNgaySinh, JRadioButton jrdNam, JRadioButton jrdNu, 
            JTextField jtfSoDienThoai, JTextArea jtaDiaChi, JCheckBox jcbTinhTrang, JLabel jlbMsg) {
        this.btnSubmit = btnSubmit;
        this.jtfMaGiangVien = jtfMaGiangVien;
        this.jtfHoTen = jtfHoTen;
        this.jdcNgaySinh = jdcNgaySinh;
        this.jrdNam = jrdNam;
        this.jrdNu = jrdNu;
        this.jtfSoDienThoai = jtfSoDienThoai;
        this.jtaDiaChi = jtaDiaChi;
        this.jcbTinhTrang = jcbTinhTrang;
        this.jlbMsg = jlbMsg;
        
        
        
    }
    
    
    
    
}
