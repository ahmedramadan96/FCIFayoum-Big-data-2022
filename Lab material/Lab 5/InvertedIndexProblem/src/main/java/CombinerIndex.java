
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class CombinerIndex extends Reducer<Text, Text, Text, Text> {

    private final Text fileAtWordFreqValue = new Text();

    @Override
    protected void reduce(Text key, java.lang.Iterable<Text> values,
                          Context context) throws IOException ,InterruptedException {
        int sum = 0;

        for(Text value:values) {
            sum += Integer.parseInt(value.toString());
        }

        // sum =3

        //<word@filename , 1>

        int splitIndex = key.toString().indexOf("@");  //4


        fileAtWordFreqValue.set(key.toString().substring(splitIndex+1)+":"+sum);  // filename:sum

        key.set(key.toString().substring(0,splitIndex)); //word

        context.write(key, fileAtWordFreqValue);  // <word , filename:3>
    }
}