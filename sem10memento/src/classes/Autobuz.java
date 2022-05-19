package classes;

public class Autobuz {
    private String numeSofer;
    private Integer consumMediu;
    private String model;
    private Integer anFabricatie;
    private Integer nrLocuri;

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsumMediu(Integer consumMediu) {
        this.consumMediu = consumMediu;
    }

    public Autobuz(String numeSofer, Integer consumMediu, String model, Integer anFabricatie, Integer nrLocuri) {
        this.numeSofer = numeSofer;
        this.consumMediu = consumMediu;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", consumMediu=").append(consumMediu);
        sb.append(", model='").append(model).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    public AutobuzMemento genereazaMemento(){
        AutobuzMemento memento= new AutobuzMemento(numeSofer, consumMediu);
        return  memento;
    }

    public void revinoLaStareaAnterioara(AutobuzMemento autobuzMemento){
        this.numeSofer=autobuzMemento.getNume();
        this.consumMediu=autobuzMemento.getConsum();

    }
}
