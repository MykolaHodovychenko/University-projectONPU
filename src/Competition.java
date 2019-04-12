import exceptions.IncorrectDataException;

import java.util.Date;

public class Competition implements Event {

    private Date date;
    private String city;
    private String projectName;
    private int winCash = 0;


    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;

        if (city.trim().isEmpty()){
            throw new IncorrectDataException("Empty name of city");
        }
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;

        if (projectName.trim().isEmpty()){
            throw new IncorrectDataException("Empty name of project");
        }
    }

    public int getWinCash() {
        return winCash;
    }

    public void setWinCash(int winCash) {
        this.winCash = winCash;

        if (winCash < 0 ) {
            throw new IncorrectDataException("Negative prize");
        }
    }
}
