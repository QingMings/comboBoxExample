package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import sample.cellFactory.AreaListCell;
import sample.model.Area;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ComboBox<Area> areaComboBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        configAreaComboBox();
    }

    private void configAreaComboBox(){
        ObservableList<Area> alist = FXCollections.observableArrayList(queryAreaData());
        areaComboBox.getItems().clear();
        areaComboBox.setItems(alist);
        areaComboBox.setButtonCell(new AreaListCell());
        areaComboBox.setCellFactory(param -> new AreaListCell());
        areaComboBox.setValue(alist.get(0));
    }

    private List<Area>  queryAreaData(){
        List<Area> areaList = new ArrayList<>();
        areaList.add(new Area("北京市",110000000000L,1));
        areaList.add(new Area("天津市",120000000000L,1));
        areaList.add(new Area("河北省",130000000000L,1));
        areaList.add(new Area("山西省",140000000000L,1));
        areaList.add(new Area("内蒙古自治区",150000000000L,1));
        areaList.add(new Area("辽宁省",210000000000L,1));
        areaList.add(new Area("吉林省",220000000000L,1));
        areaList.add(new Area("黑龙江省",230000000000L,1));
        areaList.add(new Area("上海市",310000000000L,1));
        areaList.add(new Area("江苏省",320000000000L,1));
        areaList.add(new Area("浙江省",330000000000L,1));
        areaList.add(new Area("安徽省",340000000000L,1));
        areaList.add(new Area("福建省",350000000000L,1));
        areaList.add(new Area("江西省",360000000000L,1));
        areaList.add(new Area("山东省",370000000000L,1));
        areaList.add(new Area("河南省",410000000000L,1));
        areaList.add(new Area("湖北省",420000000000L,1));
        areaList.add(new Area("湖南省",430000000000L,1));
        areaList.add(new Area("广东省",440000000000L,1));
        areaList.add(new Area("广西壮族自治区",450000000000L,1));
        areaList.add(new Area("海南省",460000000000L,1));
        areaList.add(new Area("重庆市",500000000000L,1));
        areaList.add(new Area("四川省",510000000000L,1));
        areaList.add(new Area("贵州省",520000000000L,1));
        areaList.add(new Area("云南省",530000000000L,1));
        areaList.add(new Area("西藏自治区",540000000000L,1));
        areaList.add(new Area("陕西省",610000000000L,1));
        areaList.add(new Area("甘肃省",620000000000L,1));
        areaList.add(new Area("青海省",630000000000L,1));
        areaList.add(new Area("宁夏回族自治区",640000000000L,1));
        areaList.add(new Area("新疆维吾尔自治区",650000000000L,1));
        return areaList;
    }
}
