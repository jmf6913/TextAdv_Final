public class SpearRoom extends LootRoom {

    private boolean spearPickedUp;

    public SpearRoom(int x, int y, Spear spear) {
        super(x, y, spear);
        this.spearPickedUp = false;
    }

    public String introText() {
        if (!spearPickedUp) {
            return "\n In a scene ripped right out of a movie\n You spot a spear sticking out of the ground illuminated by the sun \n You decide to take it. \n You have obtained a spear! \n";
        } else {
            return "\n Nothing is here now";
        }
    }


        }

