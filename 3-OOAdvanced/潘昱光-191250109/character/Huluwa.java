package character;
abstract public class Huluwa{
    int level;
    static int count;
    static{
        count=0;
    }
    public Huluwa(){
        ++Huluwa.count;
    }
    abstract public void call();
    public boolean largerThan(Huluwa huluwa){
        return this.level>huluwa.level;
    }
    public void changePosition(Huluwa[] huluwas,Huluwa another){
        int i=0,j=0;
        for(;i<huluwas.length;++i){
            if(huluwas[i].equals(this)){
                break;
            }
        }
        for(;j<huluwas.length;++j){
            if(huluwas[j].equals(another)){
                break;
            }
        }
        if(i<huluwas.length&&j<huluwas.length){
            huluwas[i]=another;
            huluwas[j]=this;
        }
    }
    public static int getCount(){
        return Huluwa.count;
    }
}
