public class Conversions
{
    private enum Unit
    {
        IMPERIAL,
        METRIC,
        ANTIENT
    };

    private enum UnitType
    {
        VOLUME,
        LENGTH,
        WEIGHT,
        TEMPERATURE,
        TIME
    };

    private float value;
    private Unit unit;
    private UnitType type;

    public Conversions()
    {
        
    }

    public float miles2kilometers(float value)
    {
        return value * 1.621371;
    }

    public float kilometers2miles(float value)
    {
        return value / 1.621371;
    }

    public float feet2meters(float value)
    {
        return value / 3.281;
    }

    public float meters2feet(float value)
    {
        return value * 3.281;
    }

    public float inches2centimeters(float value)
    {
        return value * 2.54;
    }

    public float centimeters2inches(float value)
    {
        return value / 2.54;
    }
}