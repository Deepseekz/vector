import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        Random _random = new Random();
        Vector _vector = new Vector();

        for (int i=0 ; i<200 ; i++)
        {
            _vector.add(new Card(_random.nextInt(4), _random.nextInt(14)));
        }

        System.out.print(_vector);

        Vector _verbose = new VerboseVector();
        _verbose.add(new Card(0 ,0));
        _verbose.add(2);
        _verbose.set(1, 3);
        Object object = _verbose.get(1);
    }
}
