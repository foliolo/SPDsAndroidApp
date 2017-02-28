package al.ahgitdevelopment.spds;

/**
 * Created by folio on 28/02/2017.
 */

public class Paciente /*implements Comparator<Paciente>*/{
    private String Name;
    private String Expiracy;
    private long ExpiracyMilisec;

    public Paciente(){}

    public Paciente(String name, String expiracy){
        this.Name = name;
        this.Expiracy = expiracy;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getExpiracy() {
        return Expiracy;
    }

    public void setExpiracy(String expiracy) {
        this.Expiracy = expiracy;
    }

    public long getExpiracyMilisec() {
        return ExpiracyMilisec;
    }

    public void setExpiracyMilisec(long expiracyMilisec) {
        ExpiracyMilisec = expiracyMilisec;
    }

//    @Override
//    public int compare(Paciente p1, Paciente p2) {
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//        Date date1 = null;
//        Date date2 = null;
//        try {
//            date1 = format.parse(p1.getExpiracy());
//            date2 = format.parse(p2.getExpiracy());
//        } catch (ParseException ex) {
//            Log.e("Paciente", "Error comaprando fechas", ex);
//        }
//
//        return date1.compareTo(date2);
//    }
}
