import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
public class World {
    public static String[][] worldMap;
    static Point starting_position = new Point(0, 0);
    public static ArrayList<MapTile> history = new ArrayList<MapTile>();

    public void load_tiles() {
        List<String> rows = new ArrayList<String>();
        try {
            BufferedReader f = new BufferedReader(new FileReader("Text Adventure - Jam Packed Jungle/src/Map1.txt"));
            String row;
            while ((row = f.readLine()) != null) {
                rows.add(row);
            }
            f.close();
            int x_max = -1;
            for (String row1 : rows) {
                int num_cols = row1.split("\t").length;
                if (num_cols > x_max) {
                    x_max = num_cols;
                }
            }
            worldMap = new String[rows.size()][x_max];
            String[] cols;
            String tile_name;
            for (int y = 0; y < rows.size(); y++) {
                cols = rows.get(y).split("\t");
                for (int x = 0; x < cols.length; x++) { // Updated loop condition
                    tile_name = cols[x];
                    if (tile_name.equals("Jeep")) {
                        starting_position.x = y;
                        starting_position.y = x;
                    }
                    worldMap[y][x] = tile_name.equals(" ") ? null : tile_name;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MapTile tileExists(int x, int y) {
        MapTile MT = null;

        if ((x >= 0 && x < worldMap.length) && (y >= 0 && y < worldMap[0].length) && (worldMap[x][y] != null)) {
            switch (worldMap[x][y]) {
                case "Jeep":
                    MT = new Jeep(x, y);
                    MT = roomExists(MT);
                    break;

                case "JungFloor":
                    MT = new JungFloor(x,y);
                    MT = roomExists(MT);
                    break;

                case "SpearRoom":
                    MT = new SpearRoom(x, y, new Spear());
                    MT = roomExists(MT);
                    break;

                case "Cliff":
                    MT = new Cliff(x, y);
                    MT = roomExists(MT);
                    break;

                case "CheetahRoom":
                    MT = new CheetahRoom(x, y, new Cheetah());
                    MT = roomExists(MT);
                    break;


                case "SeeTemple":
                    MT = new SeeTemple(x, y);
                    MT = roomExists(MT);
                    break;

                case "Waterfall":
                    MT = new Waterfall(x, y);
                    MT = roomExists(MT);
                    break;

                case "BrickRoad":
                    MT = new BrickRoad(x, y);
                    MT = roomExists(MT);
                    break;

                case "UnGrave":
                    MT = new UnGrave(x,y);
                    MT = roomExists(MT);
                    break;

                case "GoblinRoom":
                    MT = new GoblinRoom(x,y, new Goblin());
                    MT = roomExists(MT);
                    break;

                case "Temple":
                    MT = new Temple(x,y);
                    MT = roomExists(MT);
                    break;


            }
        }

        return MT;
    }

    public static MapTile roomExists(MapTile MT){
        if (history.indexOf(MT) != -1){
            MT = history.get(history.indexOf(MT));
        } else {
            history.add(MT);
        }
        return MT;
    }
}