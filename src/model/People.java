/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import report.Generatable;
import report.ReportGenerator;

/**
 *
 * @author howar
 */
public class People extends User implements Generatable {

    private PeopleType peopleType;
    private VaccincationStatus vaccinationStatus;
    private List<Vaccination> vaccinations;
    private LocalDate dob;
    private Gender gender;
    private String peopleId;
    private String address;
    private String country;

    public People(PeopleType peopleType, LocalDate dob, Gender gender, String peopleId, String address, String country, String username, String name, String password) {
        this(peopleType, VaccincationStatus.UNVACINNATED, new ArrayList<Vaccination>(), dob, gender, peopleId, address, country, username, name, password);
    }

    public People(PeopleType peopleType, VaccincationStatus vaccinationStatus, List<Vaccination> vaccinations, LocalDate dob, Gender gender, String peopleId, String address, String country, String username, String name, String password) {
        super(username, name, password);
        this.peopleType = peopleType;
        this.vaccinationStatus = vaccinationStatus;
        this.vaccinations = vaccinations;
        this.dob = dob;
        this.gender = gender;
        this.peopleId = peopleId;
        this.address = address;
        this.country = country;
    }

    @Override
    public String toString() {
        return "People{" + "userId=" + this.getUserId().toString() + ", username=" + this.getUsername() + ", name=" + this.getName() + ", password=" + this.getPassword() + ", peopleType=" + peopleType + ", vaccinationStatus=" + vaccinationStatus + ", vaccinations=" + vaccinations + ", dob=" + dob + ", gender=" + gender + ", peopleId=" + peopleId + ", address=" + address + ", country=" + country + '}';
    }


    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public PeopleType getPeopleType() {
        return peopleType;
    }

    public void setPeopleType(PeopleType peopleType) {
        this.peopleType = peopleType;
    }

    public VaccincationStatus getVaccinationStatus() {
        return vaccinationStatus;
    }

    public void setVaccinationStatus(VaccincationStatus vaccinationStatus) {
        this.vaccinationStatus = vaccinationStatus;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(String peopleId) {
        this.peopleId = peopleId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getGenerateTitle() {
        return "Personal Information";
    }

    @Override
    public String getGenerateContent() {
        StringBuilder strb = new StringBuilder();
        String lineBreak = ReportGenerator.LINE_SEPERATOR;
        String nationality = "";

        if (this.getPeopleType() == PeopleType.CITIZEN) {
            nationality = "Malaysian";
        }

        if (this.getPeopleType() == PeopleType.NON_CITIZEN) {
            nationality = "Non Malaysian";
        }

        strb.append("Name: \t");
        strb.append(this.getName());
        strb.append(lineBreak);
        strb.append("Nationality: \t");
        strb.append(nationality);
        strb.append(lineBreak);
        strb.append("Country: \t");
        strb.append(this.getCountry());
        strb.append(lineBreak);
        strb.append("Identity No.: \t");
        strb.append(this.getPeopleId());
        strb.append(lineBreak);
        strb.append("Date of Birth: \t");
        strb.append(this.getDob());

        return strb.toString();
    }

    public enum PeopleType {
        CITIZEN,
        NON_CITIZEN
    }

    public static enum VaccincationStatus {
        UNVACINNATED,
        PARTIALLY_VACCINATED,
        FULLY_VACCINATED;

        private static VaccincationStatus[] vals = values();

        public VaccincationStatus next() {
            return vals[(this.ordinal() + 1) % vals.length];
        }
    }

    public enum Gender {
        FEMALE,
        MALE
    }
}
