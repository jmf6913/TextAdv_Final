public class Gold extends Item{
    public int amt;

    public Gold(int amt) {
        super("Gold", String.format("A round coin with its weight stamped on the front",String.valueOf(amt)), amt);
        this.amt = amt;
    }
}
