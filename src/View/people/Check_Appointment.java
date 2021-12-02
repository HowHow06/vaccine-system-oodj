/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.people;

import DAO.AppointmentDAO;
import DAO.PeopleDAO;
import DAOFileImp.FileAppointmentDAO;
import DAOFileImp.FilePeopleDAO;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.DateTimePicker;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings.TimeArea;
import com.github.lgooddatepicker.zinternaltools.InternalUtilities;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Appointment;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.UUID;
import model.People;
import model.Appointment;

/**
 *
 * @author Mohin Paramasivam
 */
public class Check_Appointment extends javax.swing.JFrame {
    JFrame jFrame_popup = new JFrame();
    /**
     * Creates new form Check_Appointment
     */
    public Check_Appointment() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Appointment Booking");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Dose 2 : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Dose 1 : ");

        jButton1.setText("Confirm Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Quit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Dashboard");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Cancel Appointment");
        jButton4.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setText("Cancel Appointment");
        jButton5.setActionCommand("X2");
        jButton5.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Username : ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addGap(19, 19, 19)))
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)
                        .addGap(67, 67, 67)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        jButton5.getAccessibleContext().setAccessibleName("X2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         People_Dashboard hframe = new People_Dashboard();
         hframe.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        String username_input = jTextField1.getText();
        PeopleDAO peopledao = FilePeopleDAO.getInstance();
        List<People> people_list = peopledao.all();
        UUID people_key = null;
        for (People people : people_list ){
            if(people.getUsername().equals(username_input)){
                people_key = people.getKey();
               
            }
        }
            
       // Search appointment for the specific userid
       
       List<UUID> arr_appointment_id = new ArrayList<UUID>();
       
       AppointmentDAO appointmentdao = FileAppointmentDAO.getInstance();
        List<Appointment> appointment_list = appointmentdao.all();
        
        for (Appointment appointments : appointment_list){
            if((appointments.getPeople().getKey().equals(people_key))){
                arr_appointment_id.add(appointments.getKey());
            }   
        }
        
        //Set the data from the appointments array to variables
        
        UUID dose1_appointment_id = null;
        UUID dose2_appointment_id = null;
        
        if(arr_appointment_id.size()==2){
            dose1_appointment_id = arr_appointment_id.get(0);
        }
        
        else if(arr_appointment_id.size()==1){
            dose1_appointment_id = arr_appointment_id.get(0);
        }
        
        
        // Update the Appointment Status based on appointment ID
        
        for (Appointment appointments : appointment_list){
            if((appointments.getKey().equals(dose1_appointment_id))){
                appointments.setAppointmentStatus(Appointment.AppointmentStatus.CANCELED);
                appointmentdao.update(people_key, appointments);
                System.out.println(appointments.getKey());
                System.out.println(appointments.getAppointmentStatus());
            }
            
        }
        
        
       /*DEBUG SHOW THAT THE DATA IS ACTUALLY CANCELLED
        for (Appointment appointments : appointment_list){
            if((appointments.getPeople().getKey().equals(people_key))){
                System.out.println(appointments);
            }
        }
        
        */
        
        
            
           
            
        
        jDateChooser1.setDate(null);
        JOptionPane.showMessageDialog(jFrame_popup, "Dose 1 Appointment Cancelled !");
        /* Add code here to cancel the appointment */
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        String username_input = jTextField1.getText();
        PeopleDAO peopledao = FilePeopleDAO.getInstance();
        List<People> people_list = peopledao.all();
        UUID people_key = null;
        for (People people : people_list ){
            if(people.getUsername().equals(username_input)){
                people_key = people.getKey();
               
            }
        }
            
       // Search appointment for the specific userid
       
       List<UUID> arr_appointment_id = new ArrayList<UUID>();
       
       AppointmentDAO appointmentdao = FileAppointmentDAO.getInstance();
        List<Appointment> appointment_list = appointmentdao.all();
        
        for (Appointment appointments : appointment_list){
            if((appointments.getPeople().getKey().equals(people_key))){
                arr_appointment_id.add(appointments.getKey());
            }   
        }
        
        //Set the data from the appointments array to variables
  
        UUID dose2_appointment_id = null;
        
        if(arr_appointment_id.size()==2){
            dose2_appointment_id = arr_appointment_id.get(1);
        }
        
        
        // Update the Appointment Status based on appointment ID
        
        for (Appointment appointments : appointment_list){
            if((appointments.getKey().equals(dose2_appointment_id))){
                appointments.setAppointmentStatus(Appointment.AppointmentStatus.CANCELED);
                appointmentdao.update(people_key, appointments);
                System.out.println(appointments.getKey());
                System.out.println(appointments.getAppointmentStatus());
            }
            
        }
        
        
       /*DEBUG SHOW THAT THE DATA IS ACTUALLY CANCELLED
        for (Appointment appointments : appointment_list){
            if((appointments.getPeople().getKey().equals(people_key))){
                System.out.println(appointments);
            }
        }
        
        */
        
        
            
           
            
        
        jDateChooser2.setDate(null);
        JOptionPane.showMessageDialog(jFrame_popup, "Dose 2 Appointment Cancelled !");
        /* Add code here to cancel the appointment */
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        //get date and time from GUI
        
        Instant dose1_date = jDateChooser1.getDate().toInstant();
        Instant dose2_date = jDateChooser2.getDate().toInstant();
        
        System.out.println(dose1_date);
        System.out.println(dose2_date);

        
        
        //Check if Dose2 appointment date is bigger than dose1 appointment
        
        int value = dose2_date.compareTo(dose1_date);
        
        AppointmentDAO appointmentdao = FileAppointmentDAO.getInstance();
        List<Appointment> appointment_list = appointmentdao.all();
        List<UUID> arr_appointment_id = new ArrayList<UUID>();
        
        if (value > 0){
            //Dose2 Appointment is greater
            
            //get appointment ids
            for(Appointment appointment : appointment_list){
                if(appointment.getPeople().getUsername().equals(jTextField1.getText())){
                 arr_appointment_id.add(appointment.getAppointmentId());
                }
            }
            
          
            UUID dose1_appointment_new = arr_appointment_id.get(0);
            UUID dose2_appointment_new = arr_appointment_id.get(1);
            
            LocalDateTime ldt_dose1 = null;
             LocalDateTime ldt_dose2 = null;
             
            for(Appointment appointment : appointment_list){
                if(dose1_appointment_new.equals(appointment.getAppointmentId())){
                    System.out.println(dose1_appointment_new);
                     ldt_dose1 = LocalDateTime.ofInstant(dose1_date, ZoneOffset.UTC);
                    System.out.println("LocalDateTime : " + ldt_dose1);
                    appointment.setTime(ldt_dose1);
                    System.out.println(appointment.getTime());
                    
                }
                
                if(dose2_appointment_new.equals(appointment.getAppointmentId())){
                    System.out.println(dose2_appointment_new);
                    ldt_dose2 = LocalDateTime.ofInstant(dose2_date, ZoneOffset.UTC);
                    System.out.println("LocalDateTime : " + ldt_dose2);
                    appointment.setTime(ldt_dose2);
                    System.out.println(appointment.getTime());
                }      
            }
            
            JOptionPane.showMessageDialog(jFrame_popup, "Appointment Confirmed!\n\n"+
                    "Dose 1 : "+ldt_dose1.getDayOfMonth()+"/"+ldt_dose1.getMonthValue()+"/"+ldt_dose1.getYear()+" "+ldt_dose1.getHour() + ":" + ldt_dose1.getMinute()+"\n"
            +"Dose 2 : "+ldt_dose2.getDayOfMonth()+"/"+ldt_dose2.getMonthValue()+"/"+ldt_dose2.getYear()+" "+ldt_dose2.getHour() + ":" + ldt_dose2.getMinute()+"\n");
            
           
               
                            
                           
        }
        
        else if (value == 0){
            
            //Show box to enter valid date
            JOptionPane.showMessageDialog(jFrame_popup, "Please Enter Different Dates for Dose 1 & Dose 2");
        }
            
        else{
           //Date1 is bigger than Date2
                //Show box to enter valid date
                JOptionPane.showMessageDialog(jFrame_popup, "Please Enter Valid Dose 1 Date");
        }
    
        

        
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        //clear all text fields
        
        jDateChooser1.setCalendar(null);
        jDateChooser2.setCalendar(null);
        
        //get appointment date  and insert into the panel
        
        
         List<LocalDateTime> arr_appointment_date = new ArrayList<LocalDateTime>();
        
        
         AppointmentDAO appointmentdao = FileAppointmentDAO.getInstance();
        List<Appointment> appointment_list = appointmentdao.all();
        
        String username_input = jTextField1.getText();
        for(Appointment appointment : appointment_list){
            if(appointment.getPeople().getUsername().equals(username_input)){
                 arr_appointment_date.add(appointment.getTime());
                 
                 
            }
        }
        
        
        
        if (arr_appointment_date.size() ==2){
             LocalDateTime dose1_appointment = arr_appointment_date.get(0);
             LocalDateTime dose2_appointment = arr_appointment_date.get(1);
             
             
             
             //convert instant to date format and output to GUI
              //https://mkyong.com/java8/java-8-convert-localdate-and-localdatetime-to-date/ 
               Date dose1 = Date.from(dose1_appointment.atZone(ZoneId.systemDefault()).toInstant());
               Date dose2 = Date.from(dose2_appointment.atZone(ZoneId.systemDefault()).toInstant());
               jDateChooser1.setDate(dose1);
               jDateChooser2.setDate(dose2);
               
              // jTextField2.setText(dose1.toString());
              // jTextField3.setText(dose2.toString());
              
     

            
        }
        
        else if  (arr_appointment_date.size() ==1 ){
            LocalDateTime dose1_appointment = arr_appointment_date.get(0); 
            
            Date dose1 = Date.from(dose1_appointment.atZone(ZoneId.systemDefault()).toInstant());
            jDateChooser1.setDate(dose1);
            //jTextField2.setText(dose1.toString());

        }
        
        
        else{
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame, "Appointments have not been scheduled!");
        }
        
        
        
        
       
        
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Check_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Check_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Check_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check_Appointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Check_Appointment().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
