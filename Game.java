 interface IPlayer{
    public static final int MAX_POWER = 100; 
    public abstract void walk();
    void jump(int force);
    void kick(int power);

}
interface ISpecialPower{
    void magicPower();
}
interface Action{
    void attack();
    void defence();
}
abstract class CommonPlayer implements Action{

    

    @Override
    public void defence() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'defence'");
    }

}
class Ryu extends CommonPlayer implements IPlayer, ISpecialPower{

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'walk'");
    }

    @Override
    public void jump(int force) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'jump'");
    }

    @Override
    public void kick(int power) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kick'");
    }

    @Override
    public void magicPower() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'magicPower'");
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }
    
}
public class Game {
    
}
