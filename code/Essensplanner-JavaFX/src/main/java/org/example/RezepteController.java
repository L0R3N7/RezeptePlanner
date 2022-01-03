package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class RezepteController {

    public Text RezeptÜberschrieft;
    public TableColumn GewichtColumn;
    public TableColumn MessartColumn;
    public TableColumn ZutatenColumn;
    public VBox ZubereitungsschritteBerceich;
    public GridPane root;
    public ScrollPane widthwidthwidth;
    public VBox widthwidthwidthwidthwidthwidth;

    @FXML
    private void initialize() {
        root.setPrefHeight(App.bpRoot.heightProperty().get());
        root.setPrefWidth(App.bpRoot.widthProperty().get());
        widthwidthwidth.setPrefWidth(App.bpRoot.widthProperty().get());
        widthwidthwidthwidthwidthwidth.setPrefWidth(App.bpRoot.widthProperty().get());
        widthwidthwidthwidthwidthwidth.setPrefHeight(App.bpRoot.heightProperty().get());
    }

    /*public void buildContent(GerichtDTO gerichteDTO){
        var r = RezeptDTORequest(gerichteDTO.getUniqueId());
        var z = ZutatenlisteDTORequest(gerichteDTO.getUniqueId());
        fillZubereitungsschritteBerceich(r, z);
    }

    private ArrayList<RezeptDTO> RezeptDTORequest(long uniqueGerichteId){
        ArrayList<RezeptDTO> rezeptDTOArrayList = new ArrayList<>();

        RezeptDTO rezeptDTO1 = new RezeptDTO(1, "Hühnerfilet würzen.");
        RezeptDTO rezeptDTO2 = new RezeptDTO(2, "Hühnerfilet in kleine jeweils 2 cm große Stücke schneiden.");

        rezeptDTOArrayList.add(rezeptDTO1);
        rezeptDTOArrayList.add(rezeptDTO2);

        return rezeptDTOArrayList;
    }
    private ArrayList<ZutatenDTO> ZutatenlisteDTORequest(long uniqueGerichteId){
        //Placeholder for Response
        ArrayList<ZutatenDTO> zutatenlisteDTOArrayList = new ArrayList<>();

        ZutatenDTO zutatenlisteDTO1 = new ZutatenDTO(500, "gramm", "Kidney Bohnen");
        ZutatenDTO zutatenlisteDTO2 = new ZutatenDTO(.1, "kg", "Hühnerfilet");
        ZutatenDTO zutatenlisteDTO3 = new ZutatenDTO(.5, "liter", "Tomatensoßse");

        zutatenlisteDTOArrayList.add(zutatenlisteDTO1);
        zutatenlisteDTOArrayList.add(zutatenlisteDTO2);
        zutatenlisteDTOArrayList.add(zutatenlisteDTO3);

        return zutatenlisteDTOArrayList;
    }

    private void fillZubereitungsschritteBerceich( ArrayList<RezeptDTO> ARezeptDto, ArrayList<ZutatenlisteDTO> AZutatenListDto){
        ZubereitungsschritteBerceich.getChildren().remove(0, ZubereitungsschritteBerceich.getChildren().size());

        ArrayList<RezeptDTO> rezeptDTOArrayList = ARezeptDto.stream().sorted((s1, s2) -> Long.compare(s1.getReihenfolge(), s2.getReihenfolge())).collect(Collectors.toCollection(ArrayList::new));
        rezeptDTOArrayList.forEach(rezeptDTO -> {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Zubereitungsschritte.fxml"));
            try{
                Parent p = fxmlLoader.load();
                ZubereitungsschritteController zubereitungsschritteController = (ZubereitungsschritteController) fxmlLoader.getController();
                zubereitungsschritteController.setZubereitungsschritt(rezeptDTO.getReihenfolge());
                zubereitungsschritteController.setAnleitung(rezeptDTO.getDesc());

                ZubereitungsschritteBerceich.getChildren().add(p);
            }catch (IOException e){
                e.printStackTrace();
            }
        });

        AZutatenListDto.forEach(zutatenlisteDTO -> {
            //GewichtColumn.getColumns().add(zutatenlisteDTO.getAmount());
            //MessartColumn.getColumns().add(zutatenlisteDTO.getMessart());
            //ZutatenColumn.getColumns().add(zutatenlisteDTO.getZutatName());
        });
    }*/



}