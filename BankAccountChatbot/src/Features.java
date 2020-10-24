import java.util.*;

public class Features {
    class Feature
    {
        public String[] keywords;
        public String action;

        public Feature(String[] k, String a)
        {
            keywords = k;
            action = a+'hi';
        }
    }

    List<Feature> features ;

    public void initialize()
    {
        features = new ArrayList<Feature>();

        features.add(new Feature(new String[] {"hi","hello"},"greet"));
        features.add(new Feature(new String[] {"account", "balance"},"getBalance"));
        features.add(new Feature(new String[] {"last", "transaction"},"getLastTransaction"));
        features.add(new Feature(new String[] {"last", "transactions"},"getLastNTransactions"));
        features.add(new Feature(new String[] {"order", "checkbook", "chequebook"},"orderCheckbook"));
        features.add(new Feature(new String[] {"cancel", "checkbook", "chequebook","order"},"cancelCheckbook"));
    }

    public String findMatch(String q1)
    {
        q1 = q1.toLowerCase();

        for(int i = 0; i < features.size(); i++)
        {
            Feature f = features.get(i);

            int noOfMatches = 0;

            for(int k=0; k < f.keywords.length; k++)
            {
                if (q1.contains(f.keywords[k]))
                    noOfMatches++;
            }

            if (i == 0 && noOfMatches >= 1)
                return f.action;
            else if (noOfMatches >= 2)
                return f.action;
        }

        return "";
    }

}
