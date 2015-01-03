package jeujava;

/**
 *
 * @author Kenrelya
 */
public class Exit extends CellContent{
    
    @Override
    public String getRaw() {
            return "E";
    }
    
    @Override
    public void interact(Playable player){
        player.getMap().UpLevel();
        player.getMap().initMap(player);
        player.getMap().showMap();
    }
    
}