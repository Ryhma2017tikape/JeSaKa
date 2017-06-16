package tikape.runko;

import java.util.ArrayList;
import java.util.HashMap;
import spark.ModelAndView;
import spark.Session;
import static spark.Spark.*;
import spark.template.thymeleaf.ThymeleafTemplateEngine;
import tikape.runko.database.Database;
import tikape.runko.database.KeskusteluDao;
import tikape.runko.database.AihealueDao;
import tikape.runko.database.ViestitDao;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Aihealue> aihealueet = new ArrayList<>();
        aihealueet.add(new Aihealue(1, "Ohjelmointi", "Ohjelmointiin liittyvät keskustelut"));
        aihealueet.add(new Aihealue(2, "Puutarhanhoito","Keskustelut kasveista, kukista ja mehiläisistä"));

        Database database = new Database("jdbc:sqlite:keskustelu.db");
        database.init();

        KeskusteluDao keskusteluDao = new KeskusteluDao(database);

        get("/", (req, res) -> {
            HashMap map = new HashMap<>();
            map.put("viesti", "Näet alla keskustelun aiheet");
            map.put("aihealueet", aihealueet);

            return new ModelAndView(map, "index");
        }, new ThymeleafTemplateEngine());

        get("/keskustelut", (req, res) -> {
            HashMap map = new HashMap<>();
            map.put("keskustelut", keskusteluDao.findAll());

            return new ModelAndView(map, "keskustelut");
        }, new ThymeleafTemplateEngine());

        get("/keskustelut/:tunnus", (req, res) -> {
            HashMap map = new HashMap<>();
            map.put("keskustelut", keskusteluDao.findOne(Integer.parseInt(req.params("tunnus"))));

            return new ModelAndView(map, "keskustelu");
        }, new ThymeleafTemplateEngine());
        
        get("/kayttoliittyma", (req, res) -> {
            HashMap map = new HashMap<>();
//            map.put("viesti", "Näet alla keskustelun aiheet");
//            map.put("aihealueet", aihealueet);

            return new ModelAndView(map, "Kayttoliittyma");
        }, new ThymeleafTemplateEngine());

    }
}
