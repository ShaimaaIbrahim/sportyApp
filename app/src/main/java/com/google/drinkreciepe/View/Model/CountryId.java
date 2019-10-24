package com.google.drinkreciepe.View.Model;

import android.net.Uri;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CountryId {

    @SerializedName("countrys")
    @Expose
    private List<Country> countrys = null;

    public List<Country> getCountryis() {
        return countrys;
    }

    public void setCountrys(List<Country> countrys) {
        this.countrys = countrys;
    }

    public class Country {

        @SerializedName("idLeague")
        @Expose
        private String idLeague;
        @SerializedName("idSoccerXML")
        @Expose
        private Object idSoccerXML;
        @SerializedName("strSport")
        @Expose
        private String strSport;
        @SerializedName("strLeague")
        @Expose
        private String strLeague;
        @SerializedName("strLeagueAlternate")
        @Expose
        private String strLeagueAlternate;
        @SerializedName("strDivision")
        @Expose
        private String strDivision;
        @SerializedName("idCup")
        @Expose
        private String idCup;
        @SerializedName("intFormedYear")
        @Expose
        private String intFormedYear;
        @SerializedName("dateFirstEvent")
        @Expose
        private String dateFirstEvent;
        @SerializedName("strGender")
        @Expose
        private String strGender;
        @SerializedName("strCountry")
        @Expose
        private String strCountry;
        @SerializedName("strWebsite")
        @Expose
        private String strWebsite;
        @SerializedName("strFacebook")
        @Expose
        private String strFacebook;
        @SerializedName("strTwitter")
        @Expose
        private String strTwitter;
        @SerializedName("strYoutube")
        @Expose
        private String strYoutube;
        @SerializedName("strRSS")
        @Expose
        private String strRSS;
        @SerializedName("strDescriptionEN")
        @Expose
        private String strDescriptionEN;
        @SerializedName("strDescriptionDE")
        @Expose
        private String strDescriptionDE;
        @SerializedName("strDescriptionFR")
        @Expose
        private String strDescriptionFR;
        @SerializedName("strDescriptionIT")
        @Expose
        private Object strDescriptionIT;
        @SerializedName("strDescriptionCN")
        @Expose
        private Object strDescriptionCN;
        @SerializedName("strDescriptionJP")
        @Expose
        private Object strDescriptionJP;
        @SerializedName("strDescriptionRU")
        @Expose
        private Object strDescriptionRU;
        @SerializedName("strDescriptionES")
        @Expose
        private Object strDescriptionES;
        @SerializedName("strDescriptionPT")
        @Expose
        private Object strDescriptionPT;
        @SerializedName("strDescriptionSE")
        @Expose
        private Object strDescriptionSE;
        @SerializedName("strDescriptionNL")
        @Expose
        private Object strDescriptionNL;
        @SerializedName("strDescriptionHU")
        @Expose
        private Object strDescriptionHU;
        @SerializedName("strDescriptionNO")
        @Expose
        private Object strDescriptionNO;
        @SerializedName("strDescriptionPL")
        @Expose
        private Object strDescriptionPL;
        @SerializedName("strDescriptionIL")
        @Expose
        private Object strDescriptionIL;
        @SerializedName("strFanart1")
        @Expose
        private String strFanart1;
        @SerializedName("strFanart2")
        @Expose
        private String strFanart2;
        @SerializedName("strFanart3")
        @Expose
        private String strFanart3;
        @SerializedName("strFanart4")
        @Expose
        private String strFanart4;
        @SerializedName("strBanner")
        @Expose
        private String strBanner;
        @SerializedName("strBadge")
        @Expose
        private String strBadge;
        @SerializedName("strLogo")
        @Expose
        private String strLogo;
        @SerializedName("strPoster")
        @Expose
        private String strPoster;
        @SerializedName("strTrophy")
        @Expose
        private String strTrophy;
        @SerializedName("strNaming")
        @Expose
        private String strNaming;
        @SerializedName("strComplete")
        @Expose
        private String strComplete;
        @SerializedName("strLocked")
        @Expose
        private String strLocked;

        public String getIdLeague() {
            return idLeague;
        }

        public void setIdLeague(String idLeague) {
            this.idLeague = idLeague;
        }

        public Object getIdSoccerXML() {
            return idSoccerXML;
        }

        public void setIdSoccerXML(Object idSoccerXML) {
            this.idSoccerXML = idSoccerXML;
        }

        public String getStrSport() {
            return strSport;
        }

        public void setStrSport(String strSport) {
            this.strSport = strSport;
        }

        public String getStrLeague() {
            return strLeague;
        }

        public void setStrLeague(String strLeague) {
            this.strLeague = strLeague;
        }

        public String getStrLeagueAlternate() {
            return strLeagueAlternate;
        }

        public void setStrLeagueAlternate(String strLeagueAlternate) {
            this.strLeagueAlternate = strLeagueAlternate;
        }

        public String getStrDivision() {
            return strDivision;
        }

        public void setStrDivision(String strDivision) {
            this.strDivision = strDivision;
        }

        public String getIdCup() {
            return idCup;
        }

        public void setIdCup(String idCup) {
            this.idCup = idCup;
        }

        public String getIntFormedYear() {
            return intFormedYear;
        }

        public void setIntFormedYear(String intFormedYear) {
            this.intFormedYear = intFormedYear;
        }

        public String getDateFirstEvent() {
            return dateFirstEvent;
        }

        public void setDateFirstEvent(String dateFirstEvent) {
            this.dateFirstEvent = dateFirstEvent;
        }

        public String getStrGender() {
            return strGender;
        }

        public void setStrGender(String strGender) {
            this.strGender = strGender;
        }

        public String getStrCountry() {
            return strCountry;
        }

        public void setStrCountry(String strCountry) {
            this.strCountry = strCountry;
        }

        public String getStrWebsite() {
            return strWebsite;
        }

        public void setStrWebsite(String strWebsite) {
            this.strWebsite = strWebsite;
        }

        public String getStrFacebook() {
            return strFacebook;
        }

        public void setStrFacebook(String strFacebook) {
            this.strFacebook = strFacebook;
        }

        public String getStrTwitter() {
            return strTwitter;
        }

        public void setStrTwitter(String strTwitter) {
            this.strTwitter = strTwitter;
        }

        public String getStrYoutube() {
            return strYoutube;
        }

        public void setStrYoutube(String strYoutube) {
            this.strYoutube = strYoutube;
        }

        public String getStrRSS() {
            return strRSS;
        }

        public void setStrRSS(String strRSS) {
            this.strRSS = strRSS;
        }

        public String getStrDescriptionEN() {
            return strDescriptionEN;
        }

        public void setStrDescriptionEN(String strDescriptionEN) {
            this.strDescriptionEN = strDescriptionEN;
        }

        public String getStrDescriptionDE() {
            return strDescriptionDE;
        }

        public void setStrDescriptionDE(String strDescriptionDE) {
            this.strDescriptionDE = strDescriptionDE;
        }

        public String getStrDescriptionFR() {
            return strDescriptionFR;
        }

        public void setStrDescriptionFR(String strDescriptionFR) {
            this.strDescriptionFR = strDescriptionFR;
        }

        public Object getStrDescriptionIT() {
            return strDescriptionIT;
        }

        public void setStrDescriptionIT(Object strDescriptionIT) {
            this.strDescriptionIT = strDescriptionIT;
        }

        public Object getStrDescriptionCN() {
            return strDescriptionCN;
        }

        public void setStrDescriptionCN(Object strDescriptionCN) {
            this.strDescriptionCN = strDescriptionCN;
        }

        public Object getStrDescriptionJP() {
            return strDescriptionJP;
        }

        public void setStrDescriptionJP(Object strDescriptionJP) {
            this.strDescriptionJP = strDescriptionJP;
        }

        public Object getStrDescriptionRU() {
            return strDescriptionRU;
        }

        public void setStrDescriptionRU(Object strDescriptionRU) {
            this.strDescriptionRU = strDescriptionRU;
        }

        public Object getStrDescriptionES() {
            return strDescriptionES;
        }

        public void setStrDescriptionES(Object strDescriptionES) {
            this.strDescriptionES = strDescriptionES;
        }

        public Object getStrDescriptionPT() {
            return strDescriptionPT;
        }

        public void setStrDescriptionPT(Object strDescriptionPT) {
            this.strDescriptionPT = strDescriptionPT;
        }

        public Object getStrDescriptionSE() {
            return strDescriptionSE;
        }

        public void setStrDescriptionSE(Object strDescriptionSE) {
            this.strDescriptionSE = strDescriptionSE;
        }

        public Object getStrDescriptionNL() {
            return strDescriptionNL;
        }

        public void setStrDescriptionNL(Object strDescriptionNL) {
            this.strDescriptionNL = strDescriptionNL;
        }

        public Object getStrDescriptionHU() {
            return strDescriptionHU;
        }

        public void setStrDescriptionHU(Object strDescriptionHU) {
            this.strDescriptionHU = strDescriptionHU;
        }

        public Object getStrDescriptionNO() {
            return strDescriptionNO;
        }

        public void setStrDescriptionNO(Object strDescriptionNO) {
            this.strDescriptionNO = strDescriptionNO;
        }

        public Object getStrDescriptionPL() {
            return strDescriptionPL;
        }

        public void setStrDescriptionPL(Object strDescriptionPL) {
            this.strDescriptionPL = strDescriptionPL;
        }

        public Object getStrDescriptionIL() {
            return strDescriptionIL;
        }

        public void setStrDescriptionIL(Object strDescriptionIL) {
            this.strDescriptionIL = strDescriptionIL;
        }

        public String getStrFanart1() {
            return strFanart1;
        }

        public void setStrFanart1(String strFanart1) {
            this.strFanart1 = strFanart1;
        }

        public String getStrFanart2() {
            return strFanart2;
        }

        public void setStrFanart2(String strFanart2) {
            this.strFanart2 = strFanart2;
        }

        public String getStrFanart3() {
            return strFanart3;
        }

        public void setStrFanart3(String strFanart3) {
            this.strFanart3 = strFanart3;
        }

        public String getStrFanart4() {
            return strFanart4;
        }

        public void setStrFanart4(String strFanart4) {
            this.strFanart4 = strFanart4;
        }

        public String getStrBanner() {
            return strBanner;
        }

        public void setStrBanner(String strBanner) {
            this.strBanner = strBanner;
        }

        public String getStrBadge() {
            return strBadge;
        }

        public void setStrBadge(String strBadge) {
            this.strBadge = strBadge;
        }

        public String getStrLogo() {
            return strLogo;
        }

        public void setStrLogo(String strLogo) {
            this.strLogo = strLogo;
        }

        public String getStrPoster() {
            return strPoster;
        }

        public void setStrPoster(String strPoster) {
            this.strPoster = strPoster;
        }

        public String getStrTrophy() {
            return strTrophy;
        }

        public void setStrTrophy(String strTrophy) {
            this.strTrophy = strTrophy;
        }

        public String getStrNaming() {
            return strNaming;
        }

        public void setStrNaming(String strNaming) {
            this.strNaming = strNaming;
        }

        public String getStrComplete() {
            return strComplete;
        }

        public void setStrComplete(String strComplete) {
            this.strComplete = strComplete;
        }

        public String getStrLocked() {
            return strLocked;
        }

        public void setStrLocked(String strLocked) {
            this.strLocked = strLocked;
        }

    }
}