package qlsv.controller;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author trand
 */
public class QuanLyGiangVienController {
    
    private JPanel jpnView;
    private JButton btnAdd;
    private JButton btnDelete;
    private JTextField jtfSearch;
    
    
    
    public QuanLyGiangVienController(JPanel jpnView, JButton btnAdd, JButton btnDelete, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.btnDelete = btnDelete;
        this.jtfSearch = jtfSearch;
        
        //this.sinhVienService = new SinhVienServiceimpl();
    }
}
