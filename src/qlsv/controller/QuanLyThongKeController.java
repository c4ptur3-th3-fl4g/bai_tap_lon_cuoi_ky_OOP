package qlsv.controller;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;
import qlsv.bean.LopHocBean;
import qlsv.service.ThongKeService;
import qlsv.service.ThongKeServiceImpl;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import qlsv.bean.KhoaHocBean;
/**
 *
 * @author trand
 */
public class QuanLyThongKeController {
    
    private ThongKeService thongKeService = null;

    public QuanLyThongKeController() {
        thongKeService = new ThongKeServiceImpl();
    }

    public void setDateToChart1(JPanel jpnItem) {
        List<LopHocBean> listItem = thongKeService.getListByLopHoc();
        if(listItem != null) {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            for(LopHocBean item : listItem) {
                dataset.addValue(item.getSoLuongSinhVien(), "Sinh Viên", item.getNgayDangKy());
            }

            JFreeChart chart = ChartFactory.createBarChart("THỐNG KÊ SỐ LƯỢNG SINH VIÊN",
                    "Ngày Đăng Ký", "Số Lượng", dataset);
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 300));

            jpnItem.removeAll();
            jpnItem.setLayout(new CardLayout());
            jpnItem.add(chartPanel);
            jpnItem.validate();
            jpnItem.repaint();
        }
    }

    public void setDateToChart2(JPanel jpnItem) {

        List<KhoaHocBean> listItem = thongKeService.getListByKhoaHoc();
        if(listItem != null) {
            TaskSeriesCollection ds = new TaskSeriesCollection();

            TaskSeries taskSeries;
            Task task;
            for(KhoaHocBean item : listItem) {
                taskSeries = new TaskSeries(item.getTenKhoaHoc());
                task = new Task(item.getTenKhoaHoc(), item.getNgayBatDau(), item.getNgayKetThuc());
                taskSeries.add(task);
                ds.add(taskSeries);
            }

            JFreeChart chart = ChartFactory.createGanttChart("THỐNG KÊ KHÓA HỌC",
                     "Khóa Học", "Thời Gian", ds);
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 300));

            jpnItem.removeAll();
            jpnItem.setLayout(new CardLayout());
            jpnItem.add(chartPanel);
            jpnItem.validate();
            jpnItem.repaint();
        }
    }

}
