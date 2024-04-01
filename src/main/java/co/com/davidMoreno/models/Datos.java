package co.com.davidMoreno.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class Datos {
    private String usuario;
    private String contrasena;


    public static List<Datos> setDatos(DataTable dataTable) {
        List<Datos> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, Datos.class));
        }
        return dates;
    }
}
