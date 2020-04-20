package com.training.assignment;

import com.training.globant.administration.Glober;
import com.training.globant.administration.Project;
import com.training.role.Manager;

import java.util.ArrayList;
import java.util.List;

public class ManagerProject extends Manager implements Assignment {
    private Glober directBoos;
    private int seniority;
    private String responsibility;

    public ManagerProject(int idNumber, String name, String lastname, String homeAddress, int cellPhone, String bloodType, String dateInitialization, double salary, Project project, String rolePurpose, String roleResponsibility, int roleCode, ArrayList<Integer> managedProjects, Glober directBoos, int seniority, String responsibility) {
        super(idNumber, name, lastname, homeAddress, cellPhone, bloodType, dateInitialization, salary, project, rolePurpose, roleResponsibility, roleCode, managedProjects);
        this.directBoos = directBoos;
        this.seniority = seniority;
        this.responsibility = responsibility;
    }


    @Override
    public Glober getDirectBoos() {
        return directBoos;
    }

    @Override
    public int getSeniority() {
        return seniority;
    }

    @Override
    public String getSeniorityResponsibility() {
        return responsibility;
    }

    @Override
    public void setDirectBoss(Glober directBoss) {
        this.directBoos = directBoss;
    }

    @Override
    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    @Override
    public void setSeniorityResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }
}
