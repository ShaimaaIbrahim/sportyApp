package com.google.drinkreciepe.View.Model;
import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sport implements Serializable {



    @SerializedName("sports")
    @Expose
    private List<Sport_> sports ;
    public List<Sport_> getSports() {
        return sports;
    }

    public void setSports(List<Sport_> sports) {
        this.sports = sports;
    }

    public class Sport_  implements Serializable{

        @SerializedName("idSport")
        @Expose
        private String idSport;
        @SerializedName("strSport")
        @Expose
        private String strSport;
        @SerializedName("strSportThumb")
        @Expose
        private String strSportThumb;
        @SerializedName("strSportDescription")
        @Expose
        private String strSportDescription;

        public String getIdSport() {
            return idSport;
        }

        public void setIdSport(String idSport) {
            this.idSport = idSport;
        }

        public String getStrSport() {
            return strSport;
        }

        public void setStrSport(String strSport) {
            this.strSport = strSport;
        }

        public String getStrSportThumb() {
            return strSportThumb;
        }

        public void setStrSportThumb(String strSportThumb) {
            this.strSportThumb = strSportThumb;
        }

        public String getStrSportDescription() {
            return strSportDescription;
        }

        public void setStrSportDescription(String strSportDescription) {
            this.strSportDescription = strSportDescription;
        }
    }}