package allcom.controller;

/**
 * Created by ljy on 15/8/19.
 * ok
 */
public class Lender {
    private String url;
    private String name;

    public Lender(String url,String name){
        this.url = url;
        this.name = name;
    }

    public String getUrl(){return this.url;}
    public void setUrl(String url){this.url = url;}

    public String getName() {return this.name;}
    public void setName(String name){this.name = name;}
}
