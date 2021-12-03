package View.personnel;

import DAO.AppointmentDAO;
import DAO.CentreDAO;
import DAO.PeopleDAO;
import DAOFileImp.FileAppointmentDAO;
import DAOFileImp.FileCentreDAO;
import DAOFileImp.FilePeopleDAO;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import model.Centre;
import model.People;
import utils.Validator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohin Paramasivam
 */
public class Appointment_Schedule extends javax.swing.JFrame {
    JFrame jFrame_popup = new JFrame();
    private CentreDAO centreDao = FileCentreDAO.getInstance();
    private PeopleDAO peopleDao = FilePeopleDAO.getInstance();
    private AppointmentDAO appDao = FileAppointmentDAO.getInstance();
    private List<People> peoples;

    /**
     * Creates new form Schedule_Appointment
     */
    public Appointment_Schedule() {
        initComponents();
        initComboboxes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbbCentre = new javax.swing.JComboBox<>();
        dtpTime = new com.github.lgooddatepicker.components.DateTimePicker();
        btnOk = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        cbbPeople = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Schedule Appointment");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Time");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Centre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name:");

        cbbCentre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnOk.setText("Submit");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        cbbPeople.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnBack)
                                    .addGap(174, 174, 174)
                                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dtpTime, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbbCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbbPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbbPeople, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbbCentre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtpTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        People people = peopleDao.getRegisteredPeople().get(cbbPeople.getSelectedIndex());
        Centre centre = centreDao.all().get(cbbCentre.getSelectedIndex());
        LocalDateTime time = dtpTime.getDateTimeStrict();

        StringBuilder strbError = new StringBuilder();
        if (Validator.isDateTimeBeforeNow(time)) {
            strbError.append("Invalid appointment time. \n");
        }

        if (time.toLocalTime().isBefore(centre.getOpenTime()) || time.toLocalTime().isAfter(centre.getCloseTime())) {
            strbError.append("Appointment time must be within the centre operation hours. \n");
        }


//        if (strbError.length() == 0) {
//            int result = -1;
//            if (people.getVaccinationStatus() == People.VaccincationStatus.FULLY_VACCINATED) {
//                result = JOptionPane.showConfirmDialog(null, "This people is fully vaccinated \nAre you sure you want to continue?", "Schedule Appointment", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//            }
//            if (result == -1 || result == JOptionPane.YES_OPTION) {
//                appDao.create(new Appointment(time, centre, people, Appointment.AppointmentStatus.PENDING));
//                JOptionPane.showMessageDialog(null, "Appointment created successfully!");
//                btnBackActionPerformed(evt);
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, strbError.toString(), "Invalid Input!", JOptionPane.ERROR_MESSAGE);
//        }

    }//GEN-LAST:event_btnOkActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        Appointments_Main hframe = new Appointments_Main();
         hframe.setLocationRelativeTo(this);
        hframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> cbbCentre;
    private javax.swing.JComboBox<String> cbbPeople;
    private com.github.lgooddatepicker.components.DateTimePicker dtpTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private void initComboboxes() {
        List<Centre> centres = centreDao.all();
        List<String> centresName = new ArrayList<>();
        List<String> peopleName = new ArrayList<>();

        for (Centre centre : centres) {
            centresName.add(centre.getName() + " | " + centre.getOpenTime().toString() + "-" + centre.getCloseTime().toString());
        }
        for (People people : peopleDao.getRegisteredPeople()) {
            peopleName.add(people.getName() + " | " + people.getAge() + " y/o | " + people.getPeopleType() + " | "+ people.getVaccinationStatus());
        }

        cbbPeople.setModel(new DefaultComboBoxModel(peopleName.toArray()));
        cbbCentre.setModel(new DefaultComboBoxModel(centresName.toArray()));

        dtpTime.setDateTimeStrict(LocalDateTime.now());
    }
}
